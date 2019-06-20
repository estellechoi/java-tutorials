package LessonB3;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class do_while_methods {

	// class�� ������ ���� 2���� ! �Ӽ� / �޼ҵ� (�޼ҵ� �ۿ��� try catch ��� �Ұ�)
	Scanner sc;
	Connection conn;
	Statement stmt;

	// ������
	// ��ü ������ �����ڸ� ���ؼ�
	do_while_methods() throws SQLException {
		sc = new Scanner(System.in);
		String db = "jdbc:mysql://localhost:3307/java?useSSL=false";
		String user = "root";
		String pw = "1234";
		conn = DriverManager.getConnection(db, user, pw);
		stmt = conn.createStatement();
	}

	public void insert() throws SQLException {

		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.println("���� : ");
		int age = sc.nextInt();
		System.out.println("���� : ");
		String address = sc.next();
		System.out.println("��ȭ��ȣ : ");
		String phone = sc.next();

		String sqlInsert = "insert into member(name, age, address, phone) ";
		sqlInsert = sqlInsert + "values('" + name + "', " + age + ", '" + address + "', '" + phone + "')";
		stmt.executeUpdate(sqlInsert);
		// �Ϸ� �ȳ���
		System.out.println("�Ϸ� !");
	}

	public void select() throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from member");
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

	public void update() throws SQLException {
		System.out.print("���� ȸ�� �̸� : ");
		String name = sc.next();

		System.out.println("1.�̸� / 2.��ȣ  / 3.����");
		
		System.out.print("������ �׸� ��ȣ ���� : ");
		int whatToUpdate = sc.nextInt();
		System.out.print("���� ���� : ");
		String updateByUser = sc.next();

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
		// ����ڰ� �ùٸ� ��ȣ�� �����ؼ� switch ���� �ߵ��ߴ��� �˻�
		if(theUpdated.length() != 0) {
			String sqlUpdate = "update member set " + theUpdated + " where name='" + name + "'";
			stmt.executeUpdate(sqlUpdate);
			System.out.println("���� �Ϸ�");
		}
	}

	public void delete() throws SQLException {
		System.out.print("���� ȸ�� �̸� : ");
		String name = sc.next();
		String sqlDelete = "delete from member where name='" + name + "'";
		stmt.executeUpdate(sqlDelete);

		System.out.println("���� �Ϸ�");
	}

}
