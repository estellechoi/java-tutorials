package LessonB4_Windows;

import javax.swing.*;
import java.awt.*;

public class awt_gridLayout extends JFrame {

	awt_gridLayout() {
		setVisible(true);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * GridLayout(a,b,c,d); a�� b�� ����(�¿�c ����d)
		// * GridLayout(a,b); a�� b��
		setLayout(new GridLayout(3,2,1,1));
		
		Button btn = new Button("Ŭ��1");
		Button btn2 = new Button("Ŭ��2");
		Button btn3 = new Button("Ŭ��3");
		Button btn4 = new Button("Ŭ��4");
		Button btn5 = new Button("Ŭ��5");
		Button btn6 = new Button("Ŭ��6");
		
		add(btn);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);

	}

}
