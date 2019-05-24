package test_method;
// 추상 클래스 (Abstract Class)
// : a type of 상위클래스 (단독 객체 생성 x)
// : 실체클래스들에서 공통으로 사용할? 필드/메소드 정의한 클래스

// how to use
// - The abstract just declares methods without {}.
// - the methods are overridden(재정의) later when used.



public abstract class Abstract {
	
	int kor;
	
	/* ⓐ abstract method without {}.
	   necessarily includes more than one abstract method,
	   when an abstract class is made.
	*/
	public abstract void input(); // will be overridden later.
	
	
	// ⓑ also has methods with {} defined.
	public void print() {
		System.out.println(" → "+kor);
	}
	

}
