package LessonB5_EventListener;

// onclick 이벤트
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;

public class implementClass_Action extends JFrame implements ActionListener {

	Button btn = new Button("닫기");
	Button btn2 = new Button("실행");

	implementClass_Action() {
		add(btn);
		add(btn2);
		
		// * add ActionListener on this Button. (this=btn 객체(버튼)에 이벤트 장착)
		// onclick = "ActionListener(this)"
		btn.addActionListener(this); 
		btn2.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.exit(0);
		// * 클릭된 버튼객체가 리턴된 객체 Object ob를 통해 각 객체에 기능 정의하기
		Object ob = e.getSource(); 
		if (ob == btn) {
			setTitle("닫기");
		} else if (ob == btn2) {
			setTitle("실행");
		}
	}

}
