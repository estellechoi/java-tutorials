package LessonB4_Windows;
// awt, swing → 윈도우 프로그래밍

import java.awt.*;
import javax.swing.*;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class Frame_awt {

	public static void main(String[] args) {

		// * 윈도우 프레임 만들기
		// 창 닫기 버튼 클릭 시, 명령 별도 필요
		Frame f = new Frame();

		// ※ setVisible, setSize 설정 필수
		f.setVisible(true);
		f.setSize(200, 200);

		// * 버튼 클래스 객체 생성
		Button btn = new Button("클릭");
		// * Frame.add(x); 프레임 안에 x 넣기
		f.add(btn);
		
// * 라벨
//		Label aa = new Label("hello");
//		f.add(aa);
// getText (사용자 입력값 가져오기)
// eventListener, keyListener(자바 내장 인터페이스)

		// 창 닫기 버튼 클릭 시, 창 닫힘
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(300, 300);

	}

}
