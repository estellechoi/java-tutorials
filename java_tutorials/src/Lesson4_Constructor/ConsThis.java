package Lesson4_Constructor;

public class ConsThis {
	
	int kor=99; // 전역변수
	
	public void print() {
		
		int kor=88; // 지역변수
		
		System.out.println(kor);
		System.out.println(this.kor); // this → 클래스 ConsThis
		
		// 변수 이름이 같을 때, 자바컴파일러는 가장 가까운 지역에서 부터 찾기 때문에
		// 전역변수(바깥)가 필요할 때 (this.변수) 불러줘야함.
	}
	
	public void printa() {
		System.out.println(kor);
	}
	

}
