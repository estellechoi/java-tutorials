package LessonB4_Windows;

import javax.swing.*;
import java.awt.*;

public class awt_Checkbox extends JFrame {

	Checkbox cbox1 = new Checkbox("¥���", true);
	Checkbox cbox2 = new Checkbox("«��");
	Checkbox cbox3 = new Checkbox("�쵿");
	Checkbox cbox4 = new Checkbox("�ø�");

	JCheckBox jcbox1 = new JCheckBox("�����", true);
	JCheckBox jcbox2 = new JCheckBox("�Ұ��");
	JCheckBox jcbox3 = new JCheckBox("������");
	JCheckBox jcbox4 = new JCheckBox("��������", true);
	
	awt_Checkbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(300,300,250,200);
		
		setLayout(new FlowLayout());
		
		add(cbox1);
		add(cbox2);
		add(cbox3);
		add(cbox4);
		add(jcbox1);
		add(jcbox2);
		add(jcbox3);
		add(jcbox4);
		
	}
	
	
}
