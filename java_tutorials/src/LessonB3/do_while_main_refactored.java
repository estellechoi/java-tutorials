package LessonB3;

import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class do_while_main_refactored {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// 객체 생성과 동시에 생성자 내용이 실행됨
			do_while_methods_refactored dm = new do_while_methods_refactored();

			int x = 0;
			do {
				System.out.println("로그인 이름 : ");
				String name = sc.next();
				System.out.println("1. 전체 회원 조회");
				System.out.println("2. 회원 정보 등록");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 정보 삭제");
				System.out.println("5. 종료하기");
				System.out.println("번호 선택 : ");
				x = sc.nextInt();

				switch (x) {
				case 1:
					dm.select();
					break;
				case 2:
					System.out.println("이름 : ");
					String addname = sc.next();
					System.out.println("나이 : ");
					int addage = sc.nextInt();
					System.out.println("도시 : ");
					String addaddress = sc.next();
					System.out.println("전화번호 : ");
					String addphone = sc.next();
					// 메소드 오버로딩
					dm.insert(addname, addage, addphone);
					dm.insert(addname, addage, addphone, addaddress);
					break;
				case 3:
					System.out.println("1.이름 / 2.번호  / 3.나이");
					System.out.print("수정할 항목 번호 선택 : ");
					int whatToUpdate = sc.nextInt();
					System.out.print("수정 내용 : ");
					String updateByUser = sc.next();
					dm.update(name, whatToUpdate, updateByUser);
					break;
				case 4:
					System.out.print("회원 확인을 위해 번호를 입력하세요.");
					String phone = sc.next();
					ResultSet rs = dm.stmt.executeQuery("select*from member where name='" + name + "'");
					rs.next();
					if (!(phone == rs.getString("phone"))) {
						System.out.println("번호 불일치");
					} else {
						dm.delete(name);
					}
					break;
				}
			} while (x != 5);
			// 3 이 아닌 경우 무한 반복 (3 입력 시 종료)
			System.out.println("종료");
			dm.conn.close();
			dm.stmt.close();

		} catch (SQLException e) {
			System.out.println("데이터베이스 접속 오류");
		}
	}

}
