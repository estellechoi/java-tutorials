package LessonB5_EventListener;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class implementClass_Key extends JFrame implements KeyListener {
	
	TextField tf = new TextField(10);
	
	implementClass_Key() {
		// TextField에 이벤트리스너 장착
		tf.addKeyListener(this);
		add(tf);
		setLayout(new FlowLayout());
		setSize(400,300);
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.print("Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.print("Released");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.print("Typed");
	}
	
}
