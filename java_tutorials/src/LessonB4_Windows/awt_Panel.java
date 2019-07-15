package LessonB4_Windows;

import java.awt.*;
import javax.swing.JFrame;

public class awt_Panel extends JFrame {

	Label name = new Label("이름");
	Label phone = new Label("전화번호");
	TextField tfname = new TextField(10);
	TextField tfphone = new TextField(10);
	Button btn = new Button("저장");
	Button btntt = new Button("test");

	awt_Panel() {
		
		setSize(300, 300);
		setLayout(new BorderLayout());
		// BorderLayout : 동서남북중 5 개 영역 구성
		// 2 개 이상의 컴포넌트를 넣기 위해 Panel 사용
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p1.add(name);
		p1.add(tfname);
		p1.add(btntt);
		p2.add(phone);
		p2.add(tfphone);

		add("North", p1);
		add("Center", p2);
		add("South", btn);
		
		setVisible(true);


	}

}
