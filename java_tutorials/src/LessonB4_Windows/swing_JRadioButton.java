package LessonB4_Windows;

import java.awt.*;
import javax.swing.*;

public class swing_JRadioButton extends JFrame {
	
	// * Checkbox 그룹으로 묶기 (1개만 선택 가능하도록)
	// * 방법 : 각 체크박스의 매개변수에 그룹 변수를 준다
	CheckboxGroup cboxg = new CheckboxGroup();
	Checkbox cbox1 = new Checkbox("남자", false, cboxg);
	Checkbox cbox2 = new Checkbox("여자", false, cboxg);
	
	// * JRadioButton 그룹으로 묶기 (1개만 선택 가능하도록)
	// * 방법 : 그룹 변수의 메소드 add를 통해 각 라디오버튼을 호출한다
	JRadioButton jradio1 = new JRadioButton("호주");
	JRadioButton jradio2 = new JRadioButton("인도");
	ButtonGroup btng = new ButtonGroup();
	
	swing_JRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(300,300, 400, 400);
		
		setLayout(new FlowLayout());
		
		// * 그룹에서 라디오버튼 호출하기
		btng.add(jradio1);
		btng.add(jradio2);
		
		// * 그룹없이 라디오버튼 호출하기 (호출 안되는데 ?)
		add(jradio1);
		add(jradio2);
		
		// * 그루핑된 체크박스 호출하기
		add(cbox1);
		add(cbox2);
	}
	

}
