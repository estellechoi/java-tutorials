package LessonB5_EventListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class implementClass_Action2 extends JFrame implements ActionListener {
	
	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	TextField result = new TextField(4);
	Button btn = new Button("�� ��");
	
	implementClass_Action2() {
		
		// ��ư�� �̺�Ʈ ����
		btn.addActionListener(this);
		
		add(num1);
		add(num2);
		add(btn);
		add(result);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,100);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// * TextField�� �Էµ� Text ��������
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		
		// * �ڷ��� int ��� Ŭ���� Integer ����ϱ�
		//   �� Object(�ֻ���Ŭ����)�� �޼ҵ� toString() ����ϱ� ����
		Integer sum = n1 + n2;
		
		// * TextField�� �� �����ϱ�
		// * int �� String (sum �� sum+"")
		// * Integer �� String (sum �� sum.toString())
		result.setText(sum.toString());
			
		}
		
	}
