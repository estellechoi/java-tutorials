package LessonB4_Windows;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.*;
import java.awt.*;

public class swing_JPasswordField extends JFrame {

	JLabel id = new JLabel("아이디 : ");
	JLabel pw = new JLabel("비밀번호 : ");
	JTextField Fid = new JTextField(10);
	JPasswordField Fpw = new JPasswordField(10);

	swing_JPasswordField() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// * setBounds() : setLocation(x좌표, y좌표) + setSize(가로, 세로)
		// * setLocation(x, y) : 디바이스 스크린에서 브라우저 창의 위치
		setBounds(300, 300, 400, 300);

		setLayout(new FlowLayout());
		
		// * TextField.setEchoChar('x');
		//   매개변수의 자료형은 char(문자 1개) → 문자 1개는 항상 '' ("" X)
		
		add(id);
		add(Fid);
		add(pw);
		add(Fpw);
	}
}
