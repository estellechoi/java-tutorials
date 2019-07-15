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

public class EventListener_insert extends JFrame implements ActionListener {

	// 속성
	JLabel Lname = new JLabel("이름");
	JTextField name = new JTextField(10);
	JLabel Lphone = new JLabel("전화번호");
	JTextField phone = new JTextField(10);
	JLabel Lage = new JLabel("나이");
	JTextField age = new JTextField(10);
	JButton btnSubmit = new JButton("저장");
	JButton btnCancel = new JButton("취소");
	Connection conn;
	Statement stmt;

	// 생성자
	EventListener_insert() {
		createWindow();
	}
	
	// 메소드 1 : DB 접속
	public void connectDB() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();	
	}
	
	// 메소드 2 : 창 열기
	public void createWindow() {
		// 버튼에 이벤트리스너 장착
		btnSubmit.addActionListener(this);
		btnCancel.addActionListener(this);
		// Panel 구성
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		p1.add(Lname);
		p1.add(name);
		p2.add(Lphone);
		p2.add(phone);
		p3.add(Lage);
		p3.add(age);
		p4.add(btnSubmit);
		p4.add(btnCancel);
		// JFrame에 추가
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        // JFrame 레이아웃
		setSize(400, 300);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	// 메소드 3 : DB에 입력값 추가
	public void inputDB() throws SQLException {
		connectDB();
		// TextField 입력값
		String dbname = name.getText();
		String dbphone = phone.getText();
		String dbage = age.getText();
		// 쿼리문
		String sql = "insert into member(name, phone, age) values('" + dbname + "','" + dbphone + "', '"+dbage+"')";
		// 쿼리 실행
		stmt.executeUpdate(sql);
	}
	
	// 메소드 4 : 버튼 클릭 시 DB에 값 전송 및 inputDB() 실행
	@Override
	public void actionPerformed(ActionEvent e) {
		// ActionListener 클래스의 추상메소드는 throw 불가 (try catch 필요)
		
		Object ob = e.getSource();
		
		if(ob == btnSubmit) {
			try {
				inputDB();
//					// to make TextField vacant 
//					name.setText("");
//					phone.setText("");
					
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} else {
			System.exit(0);
		}
	}

	// 메소드 5: DB 접속 끊기
	public void closeDB() throws SQLException {
		stmt.close();
		conn.close();
	}

}
