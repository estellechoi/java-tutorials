package LessonB4_Windows;

import javax.swing.*;
import java.awt.*;

public class awt_Checkbox extends JFrame {

	Checkbox cbox1 = new Checkbox("Â¥Àå¸é", true);
	Checkbox cbox2 = new Checkbox("Â«»Í");
	Checkbox cbox3 = new Checkbox("¿ìµ¿");
	Checkbox cbox4 = new Checkbox("³Ã¸é");

	JCheckBox jcbox1 = new JCheckBox("ºñºö¹ä", true);
	JCheckBox jcbox2 = new JCheckBox("ºÒ°í±â");
	JCheckBox jcbox3 = new JCheckBox("¼³··ÅÁ");
	JCheckBox jcbox4 = new JCheckBox("Á¦À°ººÀ½", true);
	
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
