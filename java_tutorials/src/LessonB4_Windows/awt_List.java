package LessonB4_Windows;
// <select multiple size=5>
// multiple : 다중선택 / size=5 : 옵션 최대 5개씩 show
import java.awt.*;
import javax.swing.*;

public class awt_List extends JFrame {
	
	// 1) AWT
	//    List(options-show size, multiple T/F)
	List li = new List(5, false);
	
	// 2) Swing
	String food[] = {"햄버거", "피자", "우동", "스시"};
	JList jli = new JList(food);
	
	awt_List() {
		setLayout(new FlowLayout());
		li.add("월요일");
		li.add("화요일");
		li.add("수요일");
		li.add("목요일");
		li.add("금요일");
		li.add("토요일");
		li.add("일요일");
		
		add(li);
		add(jli);
		setVisible(true);
		pack(); // better than setSize()
		
	}

}
