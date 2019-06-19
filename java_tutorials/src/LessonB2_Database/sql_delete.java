package LessonB2_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class sql_delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root",
					"1234");
			Statement stmt = conn.createStatement();

			System.out.print("삭제할 레코드 id :");
			int id = sc.nextInt();
			System.out.println("입력 완료");

			String sql = "delete from member where id=" + id;
			stmt.executeUpdate(sql);

			stmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("SQL Exception");
		}

	}

}
