package LessonB3_doWhile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class select_orderby {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	String sql;

	// ������
	select_orderby() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}

	public void selectPrint(int theSelected) throws SQLException {
		switch (theSelected) {
		case 1:
			print("name");
			break;
		case 2:
			print("phone");
			break;
		case 3:
			print("age");
			break;
		case 4:
			print("address");
			break;
		case 5:
			System.out.println("���α׷� ����");
			break;
		default:
			System.out.println("�߸��� ����");
		}
	}

	public void print(String field) throws SQLException {
		sql = "select*from member order by " + field + " asc";
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.printf("%10s", rs.getString("name") + " ");
			System.out.printf("%10s", rs.getString("phone") + " ");
			System.out.printf("%2s", rs.getString("age") + " ");
			System.out.printf("%8s", rs.getString("address") + " ");
			System.out.println("");
		}
	}

	// �����ͺ��̽� ���� �޼ҵ�
	public void dbClose() throws SQLException {
		conn.close();
		stmt.close();
	}

}
