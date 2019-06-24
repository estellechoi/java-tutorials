package LessonB3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class do_while_methods_refactored {

	// * Ŭ��������(��������)
	Connection conn; // ���α׷��� ���� DB���� ����
	Statement stmt; // DB�������� ���� ������ ���� Ŭ����
	String name;
	int age;
	String phone;

	// ������(Ŭ��������)
	do_while_methods_refactored() throws SQLException {

		String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
		conn = DriverManager.getConnection(db, "root", "1234");
		stmt = conn.createStatement();
	}

	public void insert(String name, int age, String phone) throws SQLException {

		String sql = "insert into member2(name, age, phone) ";
		sql = sql + "values('" + name + "', " + age + ", '" + phone + "')";
		stmt.executeUpdate(sql);
		System.out.println("member2 �߰� �Ϸ� !");
	}
	// �Ű����� 4���� ��� member ���̺� ���ڵ� �߰��ǵ��� ����ÿ�. (�����ε�)
	
	public void insert(String name, int age, String phone, String address) throws SQLException {
		
		String sql = "insert into member(name, age, address, phone) ";
		sql = sql + "values('" + name + "', " + age + ", '" + address + "', '" + phone + "')";
		stmt.executeUpdate(sql);
		System.out.println("member �߰� �Ϸ� !");
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
		// ����ڰ� �ùٸ� ��ȣ�� �����ؼ� switch ���� �� �����ߴ��� �˻�
		if (theUpdated.length() != 0) {
			String sqlUpdate = "update member2 set " + theUpdated + " where name='" + name + "'";
			stmt.executeUpdate(sqlUpdate);
			System.out.println("���� �Ϸ�");
		}
	}

	public void delete(String name) throws SQLException {
		String sqlDelete = "delete from member2 where name='" + name + "'";
		stmt.executeUpdate(sqlDelete);
		System.out.println("���� �Ϸ�");
	}
}
