package LessonB4_Windows;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class component_Button extends JFrame {

	component_Button() {
		setVisible(true);
		setSize(300, 200);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * FlowLayout(); �ڵ� ������� ������Ʈ ����
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Ŭ���ϼ���");
		add(btn);
		JButton btn2 = new JButton("Ȯ���ϼ���");
		add(btn2);
		JButton btn3 = new JButton("Ŭ��1");
		add(btn3);
		JButton btn4 = new JButton("Ŭ��2");
		add(btn4);
		JButton btn5 = new JButton("Ŭ��3");
		add(btn5);
	}

}
