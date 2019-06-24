package LessonB3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class do_while_methods_refactored {

	// * 클래스변수(전역변수)
	Connection conn; // 프로그래밍 언어와 DB서버 연결
	Statement stmt; // DB서버에서 쿼리 실행을 위한 클래스
	String name;
	int age;
	String phone;

	// 생성자(클래스변수)
	do_while_methods_refactored() throws SQLException {

		String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
		conn = DriverManager.getConnection(db, "root", "1234");
		stmt = conn.createStatement();
	}

	public void insert(String name, int age, String phone) throws SQLException {

		String sql = "insert into member2(name, age, phone) ";
		sql = sql + "values('" + name + "', " + age + ", '" + phone + "')";
		stmt.executeUpdate(sql);
		System.out.println("member2 추가 완료 !");
	}
	// 매개변수 4개인 경우 member 테이블에 레코드 추가되도록 만드시오. (오버로딩)
	
	public void insert(String name, int age, String phone, String address) throws SQLException {
		
		String sql = "insert into member(name, age, address, phone) ";
		sql = sql + "values('" + name + "', " + age + ", '" + address + "', '" + phone + "')";
		stmt.executeUpdate(sql);
		System.out.println("member 추가 완료 !");
	}

	public void select() throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from member2");
		rs.last();
		int rec = rs.getRow();
		rs.first();
		for (int i = 1; i <= rec; i++) {
			System.out.printf("%10s", rs.getString("name"));
			System.out.print("  ");
			System.out.printf("%10s", rs.getString("phone"));
			System.out.print("  ");
			System.out.printf("%2s", rs.getString("age"));
			System.out.print("  ");
			rs.next();
			System.out.println("");
		}
	}

	public void update(String name, int whatToUpdate, String updateByUser) throws SQLException {
		String theUpdated = null;

		switch (whatToUpdate) {
		case 1:
			theUpdated = "name='" + updateByUser + "'";
			break;
		case 2:
			theUpdated = "phone='" + updateByUser + "'";
			break;
		case 3:
			theUpdated = "age=" + updateByUser;
			break;
		}
		// 사용자가 올바른 번호를 선택해서 switch 문이 잘 동작했는지 검사
		if (theUpdated.length() != 0) {
			String sqlUpdate = "update member2 set " + theUpdated + " where name='" + name + "'";
			stmt.executeUpdate(sqlUpdate);
			System.out.println("수정 완료");
		}
	}

	public void delete(String name) throws SQLException {
		String sqlDelete = "delete from member2 where name='" + name + "'";
		stmt.executeUpdate(sqlDelete);
		System.out.println("삭제 완료");
	}
}
