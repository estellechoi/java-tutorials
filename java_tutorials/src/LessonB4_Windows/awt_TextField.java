package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class awt_TextField extends JFrame {

	// * new Label(); �۾� �ֱ�
	// * new TextField(size); text type input �ֱ�
	Label id = new Label("���̵� : ");
	Label pw = new Label("��й�ȣ : ");
	TextField Tid = new TextField(10);
	TextField Tpw = new TextField(10);

	awt_TextField() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// * setBounds() : setLocation(x��ǥ, y��ǥ) + setSize(����, ����)
		// * setLocation(x, y) : ����̽� ��ũ������ ������ â�� ��ġ
		setBounds(300, 300, 400, 300);

		setLayout(new FlowLayout());
		
		// * TextField.setEchoChar('x');
		//   �Ű������� �ڷ����� char(���� 1��) �� ���� 1���� �׻� '' ("" X)
		Tpw.setEchoChar('*'); 
		
		add(id);
		add(Tid);
		add(pw);
		add(Tpw);
	}

}
