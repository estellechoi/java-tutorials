package LessonB5_EventListener;

// onclick �̺�Ʈ
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;

public class implementClass_Action extends JFrame implements ActionListener {

	Button btn = new Button("�ݱ�");
	Button btn2 = new Button("����");

	implementClass_Action() {
		add(btn);
		add(btn2);
		
		// * add ActionListener on this Button. (this=btn ��ü(��ư)�� �̺�Ʈ ����)
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
		// * Ŭ���� ��ư��ü�� ���ϵ� ��ü Object ob�� ���� �� ��ü�� ��� �����ϱ�
		Object ob = e.getSource(); 
		if (ob == btn) {
			setTitle("�ݱ�");
		} else if (ob == btn2) {
			setTitle("����");
		}
	}

}
