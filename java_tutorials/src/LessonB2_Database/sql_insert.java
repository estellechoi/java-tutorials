package LessonB2_Database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class sql_insert {

	public void Test() throws SQLException {

		String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
		String user = "root";
		String pw = "1234";
		Connection conn = DriverManager.getConnection(db, user, pw);
		Statement stmt = conn.createStatement();

		// 사용자 입력값
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name : ");
		String name = sc.next();
		System.out.println("Age : ");
		int age = sc.nextInt();
		System.out.println("City you're living in : ");
		String address = sc.next();
		System.out.println("Phone number : ");
		String phone = sc.next();

		String sql = "insert into member(name, age, address, phone) ";
		sql = sql + "values('" + name + "', " + age + ", '" + address + "', '" + phone + "')";
		stmt.executeUpdate(sql);
		
		// 완료 안내문
		System.out.println("completed !");
	}

	public static void main(String[] args) {

		sql_insert se = new sql_insert();

		try {
			se.Test();
		} catch (SQLException e) {
			System.out.println("SQL Exception !");
		}
	}

}
