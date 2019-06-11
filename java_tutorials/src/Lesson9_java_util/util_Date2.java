package Lesson9_java_util;
import java.util.Date;
// �� ��� ��� SimpleDateFormat(); �̿����� !
public class util_Date2 {

	public static void main(String[] args) {
		
		Date day = new Date();
		
		// 2019-06-11 ���
		int y = day.getYear()+1900;
		int m = day.getMonth()+1;
		int d = day.getDate();
		
		// * ���� ���ڸ����� ǥ���ϱ� (int �� String)
		String mKor = m+"";
		
		if(mKor.length() == 1) { // if(m<10)
			mKor = "0"+mKor;
		}
		
		// * ���� ���ڸ����� ǥ���ϱ� (int �� String)
		String dKor = d+"";
		
		if(dKor.length() == 1) {
			dKor = "0"+dKor;
		}
		
		System.out.println(y+"-"+mKor+"-"+dKor);
		
		// 2019�� 06�� 11�� ���
		
		System.out.println(y+"�� "+mKor+"�� "+dKor+"��");
		
		// 10:30:31 (�ú���) ���
		
		int hour = day.getHours();
		int minute = day.getMinutes();
		int second = day.getSeconds();
		
		// * �ð� ���ڸ����� ǥ���ϱ�
		
		System.out.println(hour+":"+minute+":"+second);
		

	}

}
