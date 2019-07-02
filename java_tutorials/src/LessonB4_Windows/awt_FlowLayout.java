package LessonB4_Windows;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class awt_FlowLayout extends JFrame {

	awt_FlowLayout() {
		setVisible(true);
		setSize(300, 200);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * FlowLayout(); 코드 순서대로 컴포넌트 정렬
		//   레이아웃 없이는 컴포넌트를 2개 이상 배치 불가능
		setLayout(new FlowLayout());
		
		Button btn = new Button("클릭1");
		Button btn2 = new Button("클릭2");
		Button btn3 = new Button("클릭3");
		Button btn4 = new Button("클릭4");
		Button btn5 = new Button("클릭5");
		
		add(btn);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);

	}

}
