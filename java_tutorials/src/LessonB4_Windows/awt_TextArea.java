package LessonB4_Windows;
import javax.swing.*;
import java.awt.*;
public class awt_TextArea extends JFrame {

	TextArea ta = new TextArea("�Է��Ͻÿ�", 5, 30);
	JTextArea jta = new JTextArea("�Է��Ͻÿ�", 5, 30);

	awt_TextArea() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(300,300,400,400);
		
		setLayout(new FlowLayout());
		
		// �ڵ��ٹٲ� �޼ҵ�
		jta.setLineWrap(true);
		
		add(ta);
		add(jta);
	}
}
