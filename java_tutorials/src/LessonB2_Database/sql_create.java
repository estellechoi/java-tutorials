package LessonB2_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_create {

	public static void Test() throws SQLException {
		String db = "jdbc:mysql://localhost:3306/java?useSSL=false";
		String user = "root";
		String pw = "apmsetup";

		// 예외 발생 가능성이 있어서 예외처리 하라고 에러 표시 (실제로는 작동할 수 있음)
		// try{} catch{} or function throws Exception (예외처리 필요)

		Connection conn = DriverManager.getConnection(db, user, pw);
		Statement stmt = conn.createStatement();
		String sql = "create table test(aa int)";
		stmt.executeUpdate(sql);
		
		// Connection이 메모리에 계속 누적되지 않도록 닫아줌.
		stmt.close();
		conn.close();
		
	}

	public static void main(String[] args) {
		// * main 함수 호출은 무조건 JVM(자바가상머신)이 한다 !
		// ∴ not proper for main function to throw Exception

		// java.sql.* (SQL 관련 API)
		// Connection Class - DB 서버와 연결
		// Statement Class - 쿼리문 실행
		// ResultSet Class

		try {
			Test();
		}
		catch (SQLException e) {
			System.out.println("Exception");
		}
	}

}
