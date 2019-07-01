package LessonB4_Windows;

import javax.swing.*;

// * JFrame 클래스를 상속받자
// * 클래스를 상속 받았다면, 부모 생성자가 먼저 실행된다
public class windowFrame extends JFrame {

	windowFrame() {
		// * 윈도우창 생성
		// JFrame f = new JFrame(); 필요없음
		// ∵ 상속받은 JFrame의 생성자가 먼저 실행되기 때문

		// * 윈도우창 기본 설정 (setVisible, setSize)
		this.setVisible(true);
		this.setSize(300, 300); // this(자신클래스) 생략 가능

		// * 윈도우창이 닫히면 프로그램 종료 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// * component 넣기 (키보드/마우스 입력양식)
		//   하나의 컴포넌트만 넣을 수 있다 ?
		JButton btn = new JButton("클릭하세요");
		this.add(btn);
	}

}
