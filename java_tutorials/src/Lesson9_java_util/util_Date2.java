package Lesson9_java_util;
import java.util.Date;
// 이 방법 대신 SimpleDateFormat(); 이용하자 !
public class util_Date2 {

	public static void main(String[] args) {
		
		Date day = new Date();
		
		// 2019-06-11 출력
		int y = day.getYear()+1900;
		int m = day.getMonth()+1;
		int d = day.getDate();
		
		// * 월을 두자리수로 표현하기 (int → String)
		String mKor = m+"";
		
		if(mKor.length() == 1) { // if(m<10)
			mKor = "0"+mKor;
		}
		
		// * 일을 두자리수로 표현하기 (int → String)
		String dKor = d+"";
		
		if(dKor.length() == 1) {
			dKor = "0"+dKor;
		}
		
		System.out.println(y+"-"+mKor+"-"+dKor);
		
		// 2019년 06월 11일 출력
		
		System.out.println(y+"년 "+mKor+"월 "+dKor+"일");
		
		// 10:30:31 (시분초) 출력
		
		int hour = day.getHours();
		int minute = day.getMinutes();
		int second = day.getSeconds();
		
		// * 시간 두자리수로 표현하기
		
		System.out.println(hour+":"+minute+":"+second);
		

	}

}
