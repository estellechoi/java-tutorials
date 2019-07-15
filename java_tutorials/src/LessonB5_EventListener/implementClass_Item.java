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
		
		ch.add("¥���");
		ch.add("«��");
		ch.add("�쵿");
		ch.add("�ᱹ��");
		ch.add("������");
		
		// Choice�� �̺�Ʈ ����
		// onchange ?
		ch.addItemListener(this);
		
		// JFrame�� ��ġ
		add(ch);
		setLayout(new FlowLayout());
		setSize(400, 300);
		setVisible(true);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		System.out.println(ch.getSelectedItem());
	}
	
}
