package LessonB5_EventListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class implementClass_Action3 extends JFrame implements ActionListener {

	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	Button btn1 = new Button("��");
	Button btn2 = new Button("��");
	Button btn3 = new Button("��");
	Button btn4 = new Button("��");
	TextField result = new TextField(4);

	implementClass_Action3() {

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		// ��ġ
		add(num1);
		add(num2);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(result);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 100);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// �Է°� ��������
		int n1 = Integer.parseInt(num1.getText());
		double n2 = Integer.parseInt(num2.getText());
		Integer res = 0;

		// Ŭ���� ��ư��ü ��������
		Object ob = e.getSource();

		// ���
		if (ob == btn1) {
			res = (int) (n1 + n2);
		} else if (ob == btn2) {
			res = (int) (n1 * n2);
		} else if (ob == btn3) {
			res = (int) (n1 / n2);
		} else if (ob == btn4) {
			res = (int) (n1 - n2);
		}

		result.setText(res.toString());

	}
}
