package LessonB6_EventListener_SQL;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventAndSQL extends JFrame implements ActionListener {

	// 속성
	JLabel Lname = new JLabel("이름");
	JTextField name = new JTextField(10);
	JLabel Lphone = new JLabel("전화번호");
	JTextField phone = new JTextField(10);
	JButton btn = new JButton("저장");
	Connection conn;
	Statement stmt;

	// 생성자
	EventAndSQL() throws SQLException {
		// ActionListener 클래스의 추상메소드는 throw 불가
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();

		setSize(400, 300);
		setLayout(new BorderLayout());

		// 버튼에 이벤트리스너 장착
		btn.addActionListener(this);
		// Panel 구성
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p1.add(Lname);
		p1.add(name);
		p2.add(Lphone);
		p2.add(phone);
		// JFrame에 배치
		add("North", p1);
		add("Center", p2);
		add("South", btn);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TextField 입력값을 DB에 저장
		// 하나의 함수에 모두 적어도 문제 없음

		// TextField 입력값
		String dbname = name.getText();
		String dbphone = phone.getText();

		// 쿼리문
		String sql = "insert into member(name, phone) values('" + dbname + "','" + dbphone + "')";

		try {
			stmt.executeUpdate(sql);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		// to make TextField vacant 
		name.setText("");
		phone.setText("");
	}

	public void closeDB() throws SQLException {
		stmt.close();
		conn.close();
	}

}
