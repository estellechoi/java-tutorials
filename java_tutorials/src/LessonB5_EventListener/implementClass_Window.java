package LessonB5_EventListener;

// * 인터페이스 WindowListener
//   : Frame에서 이벤트(클릭 등) 발생 시 실행될 메소드를 가진 인터페이스 
//     인터페이스 구현(오버라이딩)을 통해 메소드 7개를 재정의
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class implementClass_Window extends Frame implements WindowListener {

	implementClass_Window() {
		setVisible(true);
		pack();
		// * add WindowListener on this Frame. (현재 창에 이벤트리스너 추가)
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 프로그램 종료
		System.out.println("프로그램 종료");
		System.exit(0); // 종료 버튼
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("아이콘화 취소"); // 최소화 버튼
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("아이콘화"); // 최소화 버튼
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

}
