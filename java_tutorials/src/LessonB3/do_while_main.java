// do {y} while(x); �ϴ� y ���� �� �� ���� ����� ���� �ݺ� �Ǵ� �ݺ����� 
package LessonB3;

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
				System.out.println("1. ȸ�� ��ȸ�ϱ�");
				System.out.println("2. ȸ�� �Է��ϱ�");
				System.out.println("3. �����ϱ�");
				System.out.println("��ȣ ���� : ");
				x = sc.nextInt();

				switch (x) {
				case 1:
					db.select();
					break;
				case 2:
					db.insert();
					break;
				}

			} while (x != 3);
			// 3 �� �ƴ� ��� ���� �ݺ� (3 �Է� �� ����)
			System.out.println("����");

		} catch (SQLException e) {
			System.out.println("SQL exception");
		}

	}
}
