package LessonB5_EventListener;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;

public class implementClass_Focus extends JFrame implements FocusListener {

	TextField tf1 = new TextField(10);
	TextField tf2 = new TextField(10);

	implementClass_Focus() {
		tf1.addFocusListener(this);
		add(tf1);
		add(tf2);
		setLayout(new FlowLayout());
		setSize(200, 200);
		setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// = onfocus of javascript
		System.out.print("focus gained");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// = onblur of javascript
		System.out.print("focus lost");
	}

}
