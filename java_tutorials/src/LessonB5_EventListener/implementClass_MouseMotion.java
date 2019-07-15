package LessonB5_EventListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class implementClass_MouseMotion extends JFrame implements MouseMotionListener {

	implementClass_MouseMotion() {

		addMouseMotionListener(this);
		setSize(400, 400);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		setTitle("xÁÂÇ¥ : " + e.getX());

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		setTitle("YÁÂÇ¥ : " + e.getY());

	}

}
