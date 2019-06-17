package LessonB2_Datebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sql_Connection {

	public static void Test() throws SQLException {
		String db = "jdbc:mysql://localhost:3306/java?useSSL=false";
		String user = "root";
		String pw = "apmsetup";

		// ���� �߻� ���ɼ��� �־ ����ó�� �϶�� ���� ǥ�� (�����δ� �۵��� �� ����)
		// try{} catch{} or function throws Exception (����ó�� �ʿ�)

		Connection conn = DriverManager.getConnection(db, user, pw);
	}

	public static void main(String[] args) {
		// * main �Լ� ȣ���� ������ JVM(�ڹٰ���ӽ�)�� �Ѵ� !
		// �� not proper for main function to throw Exception

		// java.sql.* (SQL ���� API)
		// Connection Class - DB ������ ����
		// Statement Class - ������ ����
		// ResultSet Class

		try {
			Test();
		}
		catch (SQLException e) {
			System.out.println("Exception");
		}
	}

}