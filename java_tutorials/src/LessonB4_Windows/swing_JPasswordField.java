package LessonB4_Windows;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.*;
import java.awt.*;

public class swing_JPasswordField extends JFrame {

	JLabel id = new JLabel("���̵� : ");
	JLabel pw = new JLabel("��й�ȣ : ");
	JTextField Fid = new JTextField(10);
	JPasswordField Fpw = new JPasswordField(10);

	swing_JPasswordField() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// * setBounds() : setLocation(x��ǥ, y��ǥ) + setSize(����, ����)
		// * setLocation(x, y) : ����̽� ��ũ������ ������ â�� ��ġ
		setBounds(300, 300, 400, 300);

		setLayout(new FlowLayout());
		
		// * TextField.setEchoChar('x');
		//   �Ű������� �ڷ����� char(���� 1��) �� ���� 1���� �׻� '' ("" X)
		
		add(id);
		add(Fid);
		add(pw);
		add(Fpw);
	}
}
