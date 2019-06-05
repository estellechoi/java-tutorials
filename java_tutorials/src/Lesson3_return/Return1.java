package Lesson3_return;

public class Return1 {
	
	public void aaa() { // void -> 리턴값 없음
		
	}

	public int sum() { // 리턴함수는 리턴값의 자료형을 void 대신 명시
		int aa=1;
		int bb=2;
		int cc=50;
		int sum=aa+bb+cc;
		
		return sum; // 함수 내의 변수 값을 실행시 리턴하겠다.
		            // 원래 함수 내에서 생성된 변수는 함수 종료시 사라지지만.
		            // 배열, 객체변수도 리턴할 수 있 다 !
		            // 리턴값은 한개씩 원칙 ! (2개 이상 보내려면 문자열로 만들어..)
		
	}
	
	

}
