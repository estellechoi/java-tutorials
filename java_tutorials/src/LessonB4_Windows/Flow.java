package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class Flow extends JFrame {

	Flow() {
		this.setVisible(true);
		this.setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// * ������Ʈ�� 2�� �̻� �߰� ������ �� (������� ��ġ)
		this.setLayout(new FlowLayout());

		Button btn = new Button("Ŭ��");
		Button btn2 = new Button("Ŭ��");
		this.add(btn);
		this.add(btn2);

	}

}
