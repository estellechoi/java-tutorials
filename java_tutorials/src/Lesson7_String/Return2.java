package Lesson7_String;

public class Return2 {
	
	// void → return X 
	public void aa(int a, int b) { 
		if(a>b)
			System.out.println("첫번째 값이 크다");
		else if (a==b)
			System.out.println("두 값이 같다");
		else
		    System.out.println("두번째 값이 크다");
	}
	
	// int → return O
	public int bb(int a,int b) {
		if(a>=b)
			 return a;
		else
			 return b;
	}
	
	
	public static void main(String[] args) {
	    
		Return2 r2 = new Return2();
	    
		// 함수 호출
		r2.aa(90, 100);
	    
		// 리턴값이 없으면 변수에 담을 수 없고, 출력도 불가능.
		System.out.println(r2.aa(90, 100));
		int n = r2.aa(90, 100);
		
		// 리턴값을 가지는 함수
		int m = r2.bb(88, 99);
		System.out.println(m);
	    System.out.println(r2.bb(88, 99));
	    
	}

}
