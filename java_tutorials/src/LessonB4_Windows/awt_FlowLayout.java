package LessonB4_Windows;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class awt_FlowLayout extends JFrame {

	awt_FlowLayout() {
		setVisible(true);
		setSize(300, 200);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * FlowLayout(); �ڵ� ������� ������Ʈ ����
		//   ���̾ƿ� ���̴� ������Ʈ�� 2�� �̻� ��ġ �Ұ���
		setLayout(new FlowLayout());
		
		Button btn = new Button("Ŭ��1");
		Button btn2 = new Button("Ŭ��2");
		Button btn3 = new Button("Ŭ��3");
		Button btn4 = new Button("Ŭ��4");
		Button btn5 = new Button("Ŭ��5");
		
		add(btn);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);

	}

}
