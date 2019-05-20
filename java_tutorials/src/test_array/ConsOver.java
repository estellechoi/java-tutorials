package test_array;

public class ConsOver {
	
	int kor;
	int eng;
	
	// *생성자 오버로딩*
	// 매개변수의 갯수와 자료형에 따라 생성자를 여러개 만든다
	
	ConsOver() {
		this.kor=60;
		this.eng=60;
	}
	
	ConsOver(int kor) {
		this.kor=kor;
		this.eng=60;
	}
	
	ConsOver(int kor, int eng) {
		this.kor=kor;
		this.eng=eng;
	}
	
	/*
	 
	 ※ 매개변수 1가지가 오는 생성자가 이미 존재하므로 오류!
	   같은 자료형 매개변수의 갯수가 같으면 생성자 중복 사용 불가
	
	*/
	
	ConsOver(double eng) { // int 자료형 쓰면 오류 !
		this.kor=60;
		this.eng=(int)eng; // double 값을 int로 변환해야 this.eng에 저장가능
	}
	
	
	public void print() {
		System.out.println(kor+eng);
	}
	

}
