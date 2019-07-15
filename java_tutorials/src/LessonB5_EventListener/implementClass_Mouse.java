package LessonB5_EventListener;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class implementClass_Mouse extends JFrame implements MouseListener {
	
	JButton btn = new JButton("확인");
	
	implementClass_Mouse() {
		btn.addMouseListener(this);
		add(btn);
		setLayout(new FlowLayout());
		setSize(300,200);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// = onmouseover of javascript
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// = onclick of javascript
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// = mouse released right after clicked
		System.out.println("마우스 클릭");
		
	}
	
	

}
