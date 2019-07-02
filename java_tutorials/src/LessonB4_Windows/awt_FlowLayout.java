package LessonB4_Windows;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class component_Button extends JFrame {

	component_Button() {
		setVisible(true);
		setSize(300, 200);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * FlowLayout(); 코드 순서대로 컴포넌트 정렬
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("클릭하세요");
		add(btn);
		JButton btn2 = new JButton("확인하세요");
		add(btn2);
		JButton btn3 = new JButton("클릭1");
		add(btn3);
		JButton btn4 = new JButton("클릭2");
		add(btn4);
		JButton btn5 = new JButton("클릭3");
		add(btn5);
	}

}
