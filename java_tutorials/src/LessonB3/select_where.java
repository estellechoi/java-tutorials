package LessonB3;

// select*from table where(����) / order by(����)
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
	String name = null;
	String phone = null;
	String address = null;

	select_where() throws SQLException {
		String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
		conn = DriverManager.getConnection(db, "root", "1234");
		stmt = conn.createStatement();
		Member = "select*from member";
	}

	// �ߺ� ���Ÿ� ���� �޼ҵ�
	private void print() throws SQLException {
		System.out.printf("%10s", rs.getString("name") + " ");
		System.out.printf("%10s", rs.getString("phone") + " ");
		System.out.printf("%2s", rs.getString("age") + " ");
		System.out.println("");
	}

	private void printIf() throws SQLException {
		rs = stmt.executeQuery(sql);
		if (!(rs.next())) {
			System.out.println("ȸ���� ã�� �� �����ϴ�.");
			System.out.println("");

		} else {
			do {
				print();
			} while (rs.next());
		}
	}

	// ����� ��ǰ��
	public void selectAll() throws SQLException {
		sql = Member;
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			print();
		}
	}

	public void selectName() throws SQLException {
		sql = Member + " where name like '%" + name + "%'";
		printIf();
	}

	public void selectPhone() throws SQLException {
		sql = Member + " where phone='" + phone + "'";
		printIf();
	}

	public void selectAddress() throws SQLException {
		sql = Member + " where address='" + address + "'";
		printIf();
	}

}
