package LessonB3_doWhile;

import java.util.Scanner;
import java.sql.SQLException;

public class select_orderby_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int theSelected;

		try {
			select_orderby db = new select_orderby();

			do {
				System.out.println("1. �̸��� ��ȸ");
				System.out.println("2. ��ȣ�� ��ȸ");
				System.out.println("3. ���̼� ��ȸ");
				System.out.println("4. �ּҺ� ��ȸ");
				System.out.println("5. ����");
				System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
				theSelected = sc.nextInt();

				db.selectPrint(theSelected);

			} while (theSelected != 5);

			db.dbClose();
			
		} catch (SQLException e) {
			System.out.println("SQL ����");
		}

	}

}
