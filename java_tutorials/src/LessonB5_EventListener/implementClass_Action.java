package LessonB5_EventListener;

// onclick �̺�Ʈ
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;

public class implementClass_Action extends JFrame implements ActionListener {

	Button btn = new Button("�ݱ�");

	implementClass_Action() {
		add(btn);
		
		// * add ActionListener on this Button. (���� â�� �̺�Ʈ �߰�)
		// onclick = "ActionListener(this)"
		btn.addActionListener(this); 

		setSize(200,200);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("���α׷� ����");
		System.exit(0);
	}

}
