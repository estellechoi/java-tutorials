package LessonB4_Windows;
//html <select>
import java.awt.*;
import javax.swing.*;

public class awt_Choice extends JFrame {
	
	// 1) AWT
	Choice ch = new Choice();
	
	// 2) Swing
	String food[] = {"�ܹ���", "����", "�쵿", "����"};
	JComboBox jcb;
	
	awt_Choice() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 200);
		setLayout(new FlowLayout());
		
		// 1) AWT
		// add options for Choice ch
		ch.add("������");
		ch.add("ȭ����");
		ch.add("������");
		ch.add("�����");
		ch.add("�ݿ���");
		ch.add("�����");
		ch.add("�Ͽ���");	
		// add Choice in JFrame.
		add(ch);
		
		// 2) Swing
		jcb = new JComboBox(food);
		add(jcb);
		
		// ? setVisible()�� jcb �տ� �ڵ��ϸ� jcb�� �Ⱥ��̴� ���� ? 
		setVisible(true); 
	}
}
