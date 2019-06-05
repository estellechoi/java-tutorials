package Lesson7_String;
import java.util.Date;

public class Return_main {

	public static void main(String[] args) {

		    // copy the Return class you made.
			Return re = new Return();
			
			int a = re.aaa();
			System.out.println(a);
			
			//
			int kor[] = re.bbb();
			System.out.println(kor[0]);
			
			// 객체변수 to를 쓸 수 있다
			Date t = re.ccc();
			System.out.println(t.getMonth());
	
		}

	}