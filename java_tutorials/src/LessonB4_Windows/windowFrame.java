package LessonB4_Windows;

import javax.swing.*;

// * JFrame Ŭ������ ��ӹ���
// * Ŭ������ ��� �޾Ҵٸ�, �θ� �����ڰ� ���� ����ȴ�
public class windowFrame extends JFrame {

	windowFrame() {
		// * ������â ����
		// JFrame f = new JFrame(); �ʿ����
		// �� ��ӹ��� JFrame�� �����ڰ� ���� ����Ǳ� ����

		// * ������â �⺻ ���� (setVisible, setSize)
		this.setVisible(true);
		this.setSize(300, 300); // this(�ڽ�Ŭ����) ���� ����

		// * ������â�� ������ ���α׷� ���� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// * component �ֱ� (Ű����/���콺 �Է¾��)
		//   �ϳ��� ������Ʈ�� ���� �� �ִ� ?
		JButton btn = new JButton("Ŭ���ϼ���");
		this.add(btn);
	}

}
