package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class awt_Button extends JFrame {

	// * 속성 : 자료형 변수, 배열, 클래스 변수(객체변수)
	// * 자료형 변수 : 하나의 값을 저장
	// * 클래스 변수 : 클래스에 포함된 속성과 메소드를 모두 저장
	Button buttonOkay = new Button("확인");
	JButton buttonCancel = new JButton("취소");
	
	// * 생성자 : 초기값 설정, 컴포넌트 추가
	awt_Button() {
		
		// 초기 설정
		setVisible(true);
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컴포넌트 추가(& 레이아웃 지정)
		setLayout(new FlowLayout());
		add(buttonOkay);
		add(buttonCancel);
	}
	
	// * 메소드 : 함수
	
}
