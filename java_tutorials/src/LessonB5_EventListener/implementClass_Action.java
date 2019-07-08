package LessonB5_EventListener;

// onclick 이벤트
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;

public class implementClass_Action extends JFrame implements ActionListener {

	Button btn = new Button("닫기");

	implementClass_Action() {
		add(btn);
		
		// * add ActionListener on this Button. (현재 창에 이벤트 추가)
		// onclick = "ActionListener(this)"
		btn.addActionListener(this); 

		setSize(200,200);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램 종료");
		System.exit(0);
	}

}
