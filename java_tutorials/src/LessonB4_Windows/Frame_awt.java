package LessonB4_Windows;
// * 윈도우 프로그래밍
// AWT(Abstract Window Toolkit) : GUI 구현 툴 (윈도우 창, 버튼 외)
// Swing : AWT의 제약을 극복하기 위해 사용됨 (좀 더 복잡하고 다양한 그래픽 컴포넌트를 사용)

import java.awt.*;
import javax.swing.*;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class Frame_awt {

	public static void main(String[] args) {

		// * 윈도우 프레임 만들기
		// 창 닫기 명령 별도 필요
		Frame f = new Frame();

		// ※ setVisible, setSize 설정 필수
		f.setVisible(true);
		f.setSize(200, 200);

		// * 버튼 클래스 객체 생성
		// * Frame.add(x); 프레임 안에 x 넣기
		Button btn = new Button("클릭");
		f.add(btn);

		// 창 닫기 버튼 클릭 시 창 닫힘
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(300, 300);

	}

}


//* 라벨
//		Label aa = new Label("hello");
//		f.add(aa);
//getText (사용자 입력값 가져오기)
//eventListener, keyListener(자바 내장 인터페이스)