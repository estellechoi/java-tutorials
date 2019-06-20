package LessonB3;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class do_while_methods {

	// class의 구성은 오직 2가지 ! 속성 / 메소드 (메소드 밖에서 try catch 사용 불가)
	Scanner sc;
	Connection conn;
	Statement stmt;

	// 생성자
	// 객체 생성은 생성자를 통해서
	do_while_methods() throws SQLException {
		sc = new Scanner(System.in);
		String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
		String user = "root";
		String pw = "1234";
		conn = DriverManager.getConnection(db, user, pw);
		stmt = conn.createStatement();
	}

	public void insert() throws SQLException {

		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("도시 : ");
		String address = sc.next();
		System.out.println("전화번호 : ");
		String phone = sc.next();

		String sqlInsert = "insert into member(name, age, address, phone) ";
		sqlInsert = sqlInsert + "values('" + name + "', " + age + ", '" + address + "', '" + phone + "')";
		stmt.executeUpdate(sqlInsert);
		// 완료 안내문
		System.out.println("완료 !");
	}

	public void select() throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from member");
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
	}

}
