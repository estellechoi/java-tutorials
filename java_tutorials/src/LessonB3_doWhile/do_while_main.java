// do {y} while(x); �ϴ� y ���� �� �� ���� ����� ���� �ݺ� �Ǵ� �ݺ����� 
package LessonB3_doWhile;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class do_while_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			// �����ڸ� �̿��ؼ� ��ü ���� (copy class)
			do_while_methods db = new do_while_methods();

			int x = 0;
			do {
				System.out.println("1. ��ü ȸ�� ��ȸ");
				System.out.println("2. ȸ�� ���� ���");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ���� ����");
				System.out.println("5. �����ϱ�");
				System.out.println("��ȣ ���� : ");
				x = sc.nextInt();

				switch (x) {
				case 1:
					db.select();
					break;
				case 2:
					db.insert();
					break;
				case 3:
					db.update();
					break;
				case 4:
					db.delete();
					break;
				}
			} while (x != 5);
			// 3 �� �ƴ� ��� ���� �ݺ� (3 �Է� �� ����)
			System.out.println("����");
			db.conn.close();
			db.stmt.close();

		} catch (SQLException e) {
			System.out.println("SQL exception");
		}

	}
}
