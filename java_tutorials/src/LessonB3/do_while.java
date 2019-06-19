// do {y} while(x); 일단 y 실행 후 → 조건 결과에 따라 반복 또는 반복종료 
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
				System.out.println("1. 회원 조회하기");
				System.out.println("2. 회원 입력하기");
				System.out.println("3. 종료하기");

				System.out.println("번호 선택 : ");
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

					// 완료 안내문
					System.out.println("completed !");
					break;
				}

			} while (x != 3);
			// 3 이 아닌 경우 무한 반복 (3 입력 시 종료)

		} catch (SQLException e) {
			System.out.println("SQL exception");
		}

	}
}
