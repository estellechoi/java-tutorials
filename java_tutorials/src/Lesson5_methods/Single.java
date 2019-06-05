package Lesson5_methods;

public class Single {
	
	int n1;
	int n2;
	String name;
	
	// 클래스와 이름이 같다 ! 생성자(Constructor) → name 초기화!
	// ⓘ private 생성자 → 다른 클래스에서 객체 생성 불가
	// → 여기 클래스에서 객체 만들어서 가져가라. 어떻게 ? return 
	private Single(String name) {
		this.name=name;
	}
	
	// 자기 클래스에서 객체 만들어서 가져가기 (return)
	// static 이용 → 왜? 외부에서 객체 생성없이 접근할 수 있으니까
	public static Single getInstance() { // ⓐ static 메소드 만들자
		Single s = new Single("youjin"); // ⓑ 클래스 복사한 객체 s 생성
		return s; // ⓒ 객체 s 리턴
		// 리턴값이 클래스 복사한 객체이기 때문에 → 자료형: Single(클래스명)
	}
	
	public void input(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public void cal() {
		int sum=n1+n2;
		System.out.println(name+" is "+sum);
	}

}
