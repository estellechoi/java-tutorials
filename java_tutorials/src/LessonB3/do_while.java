// do {y} while(x); �ϴ� y ���� �� �� ���� ����� ���� �ݺ� �Ǵ� �ݺ����� 
package LessonB3;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class do_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
			String user = "root";
			String pw = "1234";
			Connection conn = DriverManager.getConnection(db, user, pw);
			Statement stmt = conn.createStatement();

			int x = 0;
			do {
				System.out.println("1. ȸ�� ��ȸ�ϱ�");
				System.out.println("2. ȸ�� �Է��ϱ�");
				System.out.println("3. �����ϱ�");

				System.out.println("��ȣ ���� : ");
				x = sc.nextInt();

				switch (x) {
				case 1:
					String sqlSelect = "select * from member";
					ResultSet rs = stmt.executeQuery(sqlSelect);
					rs.last();
					int rec = rs.getRow();
					rs.first();
					for (int i = 1; i <= rec; i++) {
						System.out.printf("%10s", rs.getString("name"));
						System.out.print(" / ");
						System.out.printf("%10s", rs.getString("phone"));
						System.out.print(" / ");
						System.out.printf("%2s", rs.getString("age"));
						System.out.print(" / ");
						rs.next();
						System.out.println("");
					}
					break;
				case 2:
					System.out.println("Name : ");
					String name = sc.next();
					System.out.println("Age : ");
					int age = sc.nextInt();
					System.out.println("City : ");
					String address = sc.next();
					System.out.println("Phone number : ");
					String phone = sc.next();

					String sqlInsert = "insert into member(name, age, address, phone) ";
					sqlInsert = sqlInsert + "values('" + name + "', " + age + ", '" + address + "', '" + phone + "')";
					stmt.executeUpdate(sqlInsert);

					// �Ϸ� �ȳ���
					System.out.println("completed !");
					break;
				}

			} while (x != 3);
			// 3 �� �ƴ� ��� ���� �ݺ� (3 �Է� �� ����)

		} catch (SQLException e) {
			System.out.println("SQL exception");
		}

	}
}
