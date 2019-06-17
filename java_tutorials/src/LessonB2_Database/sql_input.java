package LessonB2_Database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class sql_input {

	public static void main(String[] args) {
		
		try {
		String db = "jdbc:mysql://localhost:3306/java?useSSL=false";
		String user = "root";
		String pw = "apmsetup";
		Connection conn = DriverManager.getConnection(db, user, pw);
		Statement stmt = conn.createStatement();
		
		String sql = "";
		stmt.executeUpdate(sql);
		
		}
		catch(SQLException e) {
			System.out.println("Exception");
		}

	}

}
