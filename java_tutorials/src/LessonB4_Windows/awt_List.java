package LessonB4_Windows;
// <select multiple size=5>
// multiple : ���߼��� / size=5 : �ɼ� �ִ� 5���� show
import java.awt.*;
import javax.swing.*;

public class awt_List extends JFrame {
	
	// 1) AWT
	//    List(options-show size, multiple T/F)
	List li = new List(5, false);
	
	// 2) Swing
	String food[] = {"�ܹ���", "����", "�쵿", "����"};
	JList jli = new JList(food);
	
	awt_List() {
		setLayout(new FlowLayout());
		li.add("������");
		li.add("ȭ����");
		li.add("������");
		li.add("�����");
		li.add("�ݿ���");
		li.add("�����");
		li.add("�Ͽ���");
		
		add(li);
		add(jli);
		setVisible(true);
		pack(); // better than setSize()
		
	}

}
