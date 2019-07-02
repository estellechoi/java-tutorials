package LessonB4_Windows;

import javax.swing.*;
import java.awt.*;

public class awt_gridLayout extends JFrame {

	awt_gridLayout() {
		setVisible(true);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * GridLayout(a,b,c,d); a행 b열 마진(좌우c 상하d)
		// * GridLayout(a,b); a행 b열
		setLayout(new GridLayout(3,2,1,1));
		
		Button btn = new Button("클릭1");
		Button btn2 = new Button("클릭2");
		Button btn3 = new Button("클릭3");
		Button btn4 = new Button("클릭4");
		Button btn5 = new Button("클릭5");
		Button btn6 = new Button("클릭6");
		
		add(btn);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);

	}

}
