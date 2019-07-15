package LessonB5_EventListener;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

public class implementClass_Item extends JFrame implements ItemListener {
	
	// <select>
	Choice ch = new Choice();
	
	implementClass_Item() {
		
		ch.add("짜장면");
		ch.add("짬뽕");
		ch.add("우동");
		ch.add("콩국수");
		ch.add("라조기");
		
		// Choice에 이벤트 장착
		// onchange ?
		ch.addItemListener(this);
		
		// JFrame에 배치
		add(ch);
		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		System.out.println(ch.getSelectedItem());
	}
	
}
