package LessonB5_EventListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class implementClass_Action2 extends JFrame implements ActionListener {
	
	TextField num1 = new TextField(4);
	TextField num2 = new TextField(4);
	TextField result = new TextField(4);
	Button btn = new Button("합 ⇒");
	
	implementClass_Action2() {
		
		// 버튼에 이벤트 장착
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
		
		// * TextField의 입력된 Text 가져오기
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		
		// * 자료형 int 대신 클래스 Integer 사용하기
		//   ∵ Object(최상위클래스)의 메소드 toString() 사용하기 위함
		Integer sum = n1 + n2;
		
		// * TextField에 값 전달하기
		// * int → String (sum → sum+"")
		// * Integer → String (sum → sum.toString())
		result.setText(sum.toString());
			
		}
		
	}
