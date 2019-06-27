package LessonB3;

import java.util.Scanner;
import java.sql.SQLException;

public class select_where_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int theSelected;

		try {
			select_where db = new select_where();

			// while 변형문 (1회 실행 후 조건에 따라 반복)
			do {
				System.out.println("1. 전체 출력하기");
				System.out.println("2. 이름 검색");
				System.out.println("3. 번호 검색");
				System.out.println("4. 주소 검색");
				System.out.println("5. 종료");
				System.out.println("메뉴 번호를 입력하세요.");
				theSelected = sc.nextInt();

				switch (theSelected) {
				case 1:
					db.search(1, "");;
					break;
					
				case 2:
					System.out.println("이름 : ");
					String name = sc.next();
					db.search(2, name);
					break;
				case 3:
					System.out.println("번호 : ");
					String phone = sc.next();
					db.search(3, phone);
					break;
				case 4:
					System.out.println("거주도시 : ");
					String address = sc.next();
					db.search(4, address);
					break;
				case 5:
					System.out.println("프로그램 종료");
					break;
				// 선택지 외의 예외값인 경우
				default:
					System.out.println("잘못된 선택");
				}

			} while (theSelected != 5); // 5가 아닐 때 프로그램 반복

		} catch (SQLException e) {
			System.out.println("SQL 오류");
		}
	}

}
