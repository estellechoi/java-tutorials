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
	ButtonGroup jradioGroup = new ButtonGroup();

	JRadioButton jradio3 = new JRadioButton("�̱�");
	JRadioButton jradio4 = new JRadioButton("������");

	
	swing_JRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(300,300, 400, 400);
		
		setLayout(new FlowLayout());
		
		// * �׷���� ������ư ȣ���ϱ� 
		add(jradio3);
		add(jradio4);
		
		// * �׷쿡�� ������ư ȣ���ϱ� (ȣ�� �ȵǴµ� ?)
		jradioGroup.add(jradio1);
		jradioGroup.add(jradio2);
		
		// * �׷��ε� üũ�ڽ� ȣ���ϱ�
		add(cbox1);
		add(cbox2);
	
	}

}
