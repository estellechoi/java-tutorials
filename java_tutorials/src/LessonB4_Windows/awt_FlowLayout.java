package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class awt_FlowLayout extends JFrame {

	awt_FlowLayout() {
		this.setVisible(true);
		this.setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * ������Ʈ�� 2�� �̻� �߰� ������ �� (������� ��ġ)
		this.setLayout(new FlowLayout());

		JButton btn = new JButton("Ŭ��");
		JButton btn2 = new JButton("Ŭ��");
		this.add(btn);
		this.add(btn2);

	}

}
