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

	// �Ӽ�
	JLabel Lname = new JLabel("�̸�");
	JTextField name = new JTextField(10);
	JLabel Lphone = new JLabel("��ȭ��ȣ");
	JTextField phone = new JTextField(10);
	JLabel Lage = new JLabel("����");
	JTextField age = new JTextField(10);
	JButton btnSubmit = new JButton("����");
	JButton btnCancel = new JButton("���");
	Connection conn;
	Statement stmt;

	// ������
	EventListener_insert() {
		createWindow();
	}
	
	// �޼ҵ� 1 : DB ����
	public void connectDB() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();	
	}
	
	// �޼ҵ� 2 : â ����
	public void createWindow() {
		// ��ư�� �̺�Ʈ������ ����
		btnSubmit.addActionListener(this);
		btnCancel.addActionListener(this);
		// Panel ����
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
		// JFrame�� �߰�
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        // JFrame ���̾ƿ�
		setSize(400, 300);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	// �޼ҵ� 3 : DB�� �Է°� �߰�
	public void inputDB() throws SQLException {
		connectDB();
		// TextField �Է°�
		String dbname = name.getText();
		String dbphone = phone.getText();
		String dbage = age.getText();
		// ������
		String sql = "insert into member(name, phone, age) values('" + dbname + "','" + dbphone + "', '"+dbage+"')";
		// ���� ����
		stmt.executeUpdate(sql);
	}
	
	// �޼ҵ� 4 : ��ư Ŭ�� �� DB�� �� ���� �� inputDB() ����
	@Override
	public void actionPerformed(ActionEvent e) {
		// ActionListener Ŭ������ �߻�޼ҵ�� throw �Ұ� (try catch �ʿ�)
		
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

	// �޼ҵ� 5: DB ���� ����
	public void closeDB() throws SQLException {
		stmt.close();
		conn.close();
	}

}
