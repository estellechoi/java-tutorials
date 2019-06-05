package Lesson4_Constructor;

public class Constructor {

	int kor;
	
	//static 
	static int eng;
	
	// ↓생성자 (생략가능) -> 여기서 안쓰고 main에서 바로 호출 가능
	
	Constructor() 
	{
		System.out.println("hello.");
	}
	
	public Constructor aa() {
		Constructor c = new Constructor();
		return c;
	}
	
	
	
}
