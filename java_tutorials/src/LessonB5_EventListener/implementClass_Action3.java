package LessonB5_EventListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class implementClass_Action3 extends JFrame implements ActionListener {

	// text 입력양식
	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	TextField result = new TextField(4);
	// text
	Label id = new Label("=");
	// button
	Button btn1 = new Button("합");
	Button btn2 = new Button("곱");
	Button btn3 = new Button("나");
	Button btn4 = new Button("뺌");
	Button btn5 = new Button("a~b");
	Button btn6 = new Button("LOTTO");

	implementClass_Action3() {

		// eventListener 장착
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);

		// frame에 배치
		add(num1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(num2);
		add(id);
		add(result);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 100);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 입력값 가져오기
		int n1 = Integer.parseInt(num1.getText());
		double n2 = Integer.parseInt(num2.getText());
		Integer resultValue = 0;

		// 클릭된 버튼객체 가져오기
		Object ob = e.getSource();

		// 계산
		if (ob == btn1) {
			resultValue = (int) (n1 + n2);
		} else if (ob == btn2) {
			resultValue = (int) (n1 * n2);
		} else if (ob == btn3) {
			resultValue = (int) (n1 / n2);
		} else if (ob == btn4) {
			resultValue = (int) (n1 - n2);
		} else if (ob == btn5) {
			for (int i = n1; i <= (int) n2; i++) {
				resultValue = resultValue + i;
			}
		} else if (ob == btn6) {
			resultValue = (int) (Math.random() * ((int) n2 - n1 + 1) + n1);
		}
		// * Math.random() : 0 이상 ~ 1 미만

		result.setText(resultValue.toString());

	}
}
