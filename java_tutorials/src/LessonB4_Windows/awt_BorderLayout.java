package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class awt_BorderLayout extends JFrame {
	
	awt_BorderLayout() {
		setVisible(true);
		setSize(300, 200);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * FlowLayout(); �ڵ� ������� ������Ʈ ����
		//   ���̾ƿ� ���̴� ������Ʈ�� 2�� �̻� ��ġ �Ұ���
		setLayout(new BorderLayout());
		
		Button btn = new Button("Ŭ��1");
		Button btn2 = new Button("Ŭ��2");
		Button btn3 = new Button("Ŭ��3");
		Button btn4 = new Button("Ŭ��4");
		Button btn5 = new Button("Ŭ��5");
		Button btn6 = new Button("Ŭ��6");
		
		// * Panel(); ���� ��й� (������ ���� ������ Panel ��ü ����)
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add("West", btn);
		p.add("East", btn6);
		// �� ���� ��ư �ߺ���� �Ұ� !
		
		add("North", p);
		add("South", btn2);
		add("West", btn3);
		add("East", btn4);
		add("Center", btn5);

	}

}