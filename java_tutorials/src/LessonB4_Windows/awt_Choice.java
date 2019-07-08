package LessonB4_Windows;
//html <select>
import java.awt.*;
import javax.swing.*;

public class awt_Choice extends JFrame {
	
	// 1) AWT
	Choice ch = new Choice();
	
	// 2) Swing
	String food[] = {"햄버거", "피자", "우동", "스시"};
	JComboBox jcb;
	
	awt_Choice() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 200);
		setLayout(new FlowLayout());
		
		// 1) AWT
		// add options for Choice ch
		ch.add("월요일");
		ch.add("화요일");
		ch.add("수요일");
		ch.add("목요일");
		ch.add("금요일");
		ch.add("토요일");
		ch.add("일요일");	
		// add Choice in JFrame.
		add(ch);
		
		// 2) Swing
		jcb = new JComboBox(food);
		add(jcb);
		
		// ? setVisible()을 jcb 앞에 코딩하면 jcb가 안보이는 이유 ?
		// 답변 출처 [StackOverFlow]
		// Once you display the UI, it should not be modified from any thread 
		// except of the EDT. In the first case you had some "luck", and it worked. 
		// In the second case probably the time of creation of the JComboBox was 
		// long enough to prevent you from modifying the UI from a thread 
		// that is not the EDT.
		setVisible(true); 
	}
}
