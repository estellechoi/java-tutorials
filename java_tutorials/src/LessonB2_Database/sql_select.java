package LessonB2_Database;
// 전체 데이터 한 번에 조회하기
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class sql_select {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
			String user = "root";
			String pw = "1234";
			Connection conn = DriverManager.getConnection(db, user, pw);
			Statement stmt = conn.createStatement();

			String sql = "select * from member";
			ResultSet rs = stmt.executeQuery(sql);

			// move to last row.
			rs.last();

			// which number of row is being pointed.
			// last row의 번호는 전체 레코드의 수
			int rec = rs.getRow();

			// move to first row.
			rs.first();

			// printf(%12s); 12자리 문자(s)로 출력
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
			
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("SQL Exception !");
		}

	}

}
