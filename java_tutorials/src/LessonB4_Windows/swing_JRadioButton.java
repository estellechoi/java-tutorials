package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class swing_JRadioButton extends JFrame {
	
	// * Checkbox �׷����� ���� (1���� ���� �����ϵ���)
	// * ��� : �� üũ�ڽ��� �Ű������� �׷� ������ �ش�
	CheckboxGroup cboxg = new CheckboxGroup();
	Checkbox cbox1 = new Checkbox("����", false, cboxg);
	Checkbox cbox2 = new Checkbox("����", false, cboxg);
	
	// * JRadioButton �׷����� ���� (1���� ���� �����ϵ���)
	// * ��� : �׷� ������ �޼ҵ� add�� ���� �� ������ư�� ȣ���Ѵ�
	JRadioButton jradio1 = new JRadioButton("ȣ��");
	JRadioButton jradio2 = new JRadioButton("�ε�");
	ButtonGroup btng = new ButtonGroup();
	
	swing_JRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(300,300, 400, 400);
		
		setLayout(new FlowLayout());
		
		// * �׷쿡�� ������ư ȣ���ϱ�
		btng.add(jradio1);
		btng.add(jradio2);
		
		// * �׷���� ������ư ȣ���ϱ� (ȣ�� �ȵǴµ� ?)
		add(jradio1);
		add(jradio2);
		
		// * �׷��ε� üũ�ڽ� ȣ���ϱ�
		add(cbox1);
		add(cbox2);
	}
	

}
