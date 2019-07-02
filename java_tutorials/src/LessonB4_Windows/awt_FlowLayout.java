package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class awt_FlowLayout extends JFrame {

	awt_FlowLayout() {
		this.setVisible(true);
		this.setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * 컴포넌트를 2개 이상 추가 가능케 함 (순서대로 배치)
		this.setLayout(new FlowLayout());

		JButton btn = new JButton("클릭");
		JButton btn2 = new JButton("클릭");
		this.add(btn);
		this.add(btn2);

	}

}
