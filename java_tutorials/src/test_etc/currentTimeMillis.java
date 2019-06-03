package test_etc;

public class currentTimeMillis {

	public static void main(String[] args) {
		
		// System.currentTimeMillis();
		// 시스템 시계에서 시간을 읽어오는 메소드 (밀리세커드(ms) 단위로 읽어옴)
		// 1970년 1월 1일부터 1초씩 세는거...
		
		long time = System.currentTimeMillis()*1/1000*1/60*1/24*1/31;
		long x = System.currentTimeMillis();
		
		// System.out.println(time);
		System.out.println(time);


	}
}
