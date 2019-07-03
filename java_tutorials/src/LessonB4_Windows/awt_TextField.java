package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class awt_TextField extends JFrame {

	// * new Label(); 글씨 넣기
	// * new TextField(size); text type input 넣기
	Label id = new Label("아이디 : ");
	Label pw = new Label("비밀번호 : ");
	TextField Tid = new TextField(10);
	TextField Tpw = new TextField(10);

	awt_TextField() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// * setBounds() : setLocation(x좌표, y좌표) + setSize(가로, 세로)
		// * setLocation(x, y) : 디바이스 스크린에서 브라우저 창의 위치
		setBounds(300, 300, 400, 300);

		setLayout(new FlowLayout());
		
		// * TextField.setEchoChar('x');
		//   매개변수의 자료형은 char(문자 1개) → 문자 1개는 항상 '' ("" X)
		Tpw.setEchoChar('*'); 
		
		add(id);
		add(Tid);
		add(pw);
		add(Tpw);
	}

}
