package LessonB5_EventListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class implementClass_Action3 extends JFrame implements ActionListener {

	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	Button btn1 = new Button("합");
	Button btn2 = new Button("곱");
	Button btn3 = new Button("나");
	Button btn4 = new Button("뺌");
	TextField result = new TextField(4);

	implementClass_Action3() {

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		// 배치
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

		// 입력값 가져오기
		int n1 = Integer.parseInt(num1.getText());
		double n2 = Integer.parseInt(num2.getText());
		Integer res = 0;

		// 클릭된 버튼객체 가져오기
		Object ob = e.getSource();

		// 계산
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
