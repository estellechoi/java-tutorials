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

	// �Ӽ�
	JLabel Lname = new JLabel("�̸�");
	JTextField name = new JTextField(10);
	JLabel Lphone = new JLabel("��ȭ��ȣ");
	JTextField phone = new JTextField(10);
	JButton btn = new JButton("����");
	Connection conn;
	Statement stmt;

	// ������
	EventAndSQL() throws SQLException {
		// ActionListener Ŭ������ �߻�޼ҵ�� throw �Ұ�
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();

		setSize(400, 300);
		setLayout(new BorderLayout());

		// ��ư�� �̺�Ʈ������ ����
		btn.addActionListener(this);
		// Panel ����
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p1.add(Lname);
		p1.add(name);
		p2.add(Lphone);
		p2.add(phone);
		// JFrame�� ��ġ
		add("North", p1);
		add("Center", p2);
		add("South", btn);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TextField �Է°��� DB�� ����
		// �ϳ��� �Լ��� ��� ��� ���� ����

		// TextField �Է°�
		String dbname = name.getText();
		String dbphone = phone.getText();

		// ������
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
