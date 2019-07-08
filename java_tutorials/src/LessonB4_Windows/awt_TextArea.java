package LessonB4_Windows;
import javax.swing.*;
import java.awt.*;
public class awt_TextArea extends JFrame {

	TextArea ta = new TextArea("입력하시오", 5, 30);
	JTextArea jta = new JTextArea("입력하시오", 5, 30);

	awt_TextArea() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(300,300,400,400);
		
		setLayout(new FlowLayout());
		
		// 자동줄바꿈 메소드
		jta.setLineWrap(true);
		
		add(ta);
		add(jta);
	}
}
