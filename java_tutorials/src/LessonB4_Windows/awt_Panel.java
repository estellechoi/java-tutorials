package LessonB4_Windows;

import java.awt.*;
import javax.swing.JFrame;

public class awt_Panel extends JFrame {

	Label name = new Label("�̸�");
	Label phone = new Label("��ȭ��ȣ");
	TextField tfname = new TextField(10);
	TextField tfphone = new TextField(10);
	Button btn = new Button("����");
	Button btntt = new Button("test");

	awt_Panel() {
		
		setSize(300, 300);
		setLayout(new BorderLayout());
		// BorderLayout : ���������� 5 �� ���� ����
		// 2 �� �̻��� ������Ʈ�� �ֱ� ���� Panel ���
		
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
