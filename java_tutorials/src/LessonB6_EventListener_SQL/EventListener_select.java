package LessonB6_EventListener_SQL;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class EventListener_select extends JFrame {
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	JLabel name;
	JLabel phone;
	JLabel age;
	
	EventListener_select() throws SQLException {
		selectDB();
	}
	
	public void selectDB() throws SQLException {
		// DB에서 값 가져오기
		ConnectDB();
		String sql = "select*from member";
		rs = stmt.executeQuery(sql);
		rs.next();
		name = new JLabel(rs.getString("name"));
		phone = new JLabel(rs.getString("phone"));
		age = new JLabel(rs.getString("age"));
		
		// JFrame에 레이블 추가
		add(name);
		add(age);
		add(phone);
		
		// JFrame 레이아웃
		setLayout(new FlowLayout());
		setSize(300,200);
		setVisible(true);
	}
	
	public void ConnectDB() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}

}
