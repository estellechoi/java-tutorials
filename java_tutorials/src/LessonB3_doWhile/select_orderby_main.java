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
				System.out.println("1. 이름순 조회");
				System.out.println("2. 번호순 조회");
				System.out.println("3. 나이순 조회");
				System.out.println("4. 주소별 조회");
				System.out.println("5. 종료");
				System.out.println("메뉴 번호를 입력하세요.");
				theSelected = sc.nextInt();

				db.selectPrint(theSelected);

			} while (theSelected != 5);

			db.dbClose();
			
		} catch (SQLException e) {
			System.out.println("SQL 오류");
		}

	}

}
