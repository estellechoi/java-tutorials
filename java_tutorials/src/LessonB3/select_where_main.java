package LessonB3;

import java.util.Scanner;
import java.sql.SQLException;

public class select_where_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int theSelected;

		try {
			select_where db = new select_where();

			// while ������ (1ȸ ���� �� ���ǿ� ���� �ݺ�)
			do {
				System.out.println("1. ��ü ����ϱ�");
				System.out.println("2. �̸� �˻�");
				System.out.println("3. ��ȣ �˻�");
				System.out.println("4. �ּ� �˻�");
				System.out.println("5. ����");
				System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
				theSelected = sc.nextInt();

				switch (theSelected) {
				case 1:
					db.search(1, "");;
					break;
					
				case 2:
					System.out.println("�̸� : ");
					String name = sc.next();
					db.search(2, name);
					break;
				case 3:
					System.out.println("��ȣ : ");
					String phone = sc.next();
					db.search(3, phone);
					break;
				case 4:
					System.out.println("���ֵ��� : ");
					String address = sc.next();
					db.search(4, address);
					break;
				case 5:
					System.out.println("���α׷� ����");
					break;
				// ������ ���� ���ܰ��� ���
				default:
					System.out.println("�߸��� ����");
				}

			} while (theSelected != 5); // 5�� �ƴ� �� ���α׷� �ݺ�

		} catch (SQLException e) {
			System.out.println("SQL ����");
		}
	}

}
