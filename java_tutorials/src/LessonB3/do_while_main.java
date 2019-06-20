// do {y} while(x); 일단 y 실행 후 → 조건 결과에 따라 반복 또는 반복종료 
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
			// 생성자를 이용해서 객체 생성 (copy class)
			do_while_methods db = new do_while_methods();

			int x = 0;
			do {
				System.out.println("1. 회원 조회하기");
				System.out.println("2. 회원 입력하기");
				System.out.println("3. 종료하기");
				System.out.println("번호 선택 : ");
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
			// 3 이 아닌 경우 무한 반복 (3 입력 시 종료)
			System.out.println("종료");

		} catch (SQLException e) {
			System.out.println("SQL exception");
		}

	}
}
