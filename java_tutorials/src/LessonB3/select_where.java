package LessonB3;

// select*from table where(조건) / order by(정렬)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select_where {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	String sql;
	String Member;

	select_where() throws SQLException {
		String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
		conn = DriverManager.getConnection(db, "root", "1234");
		stmt = conn.createStatement();
		Member = "select*from member";
	}

	// 중복 제거를 위한 메소드
	private void print() throws SQLException {
		System.out.printf("%10s", rs.getString("name") + " ");
		System.out.printf("%10s", rs.getString("phone") + " ");
		System.out.printf("%2s", rs.getString("age") + " ");
		System.out.println("");
	}

	private void printIf(String sql) throws SQLException {
		rs = stmt.executeQuery(sql);
		if (!(rs.next())) {
			System.out.println("회원을 찾을 수 없습니다.");
			System.out.println("");

		} else {
			do {
				print();
			} while (rs.next());
		}
	}

	// 실행될 부품들
	public void selectAll() throws SQLException {
		sql = Member+" order by name asc";
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			print();
		}
	}

	public void selectName(String name) throws SQLException {
		// select*from table where 조건 order by 정렬 (※ 순서 주의)
		sql = Member + " where name like '%" + name + "%' order by name asc";
		printIf(sql);
	}

	public void selectPhone(String phone) throws SQLException {
		sql = Member + " where phone='" + phone + "' order by name asc";
		printIf(sql);
	}

	public void selectAddress(String address) throws SQLException {
		sql = Member + " where address='" + address + "' order by name asc";
		printIf(sql);
	}

	public void search(int n, String str) throws SQLException {
		switch (n) {
		case 1:
			selectAll();
			break;
		case 2:
			selectName(str);
			break;
		case 3:
			selectPhone(str);
			break;
		case 4:
			selectAddress(str);
			break;
		}
	}

}
