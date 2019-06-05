package Lesson4_Constructor;

public class ConsTest {
	
	// 생성자를 통해 a~b 합을 구하시오. 생성자(a,b)
	
	int a;
	int b;
	int sum;
	
	ConsTest(int a, int b) {
		for(int i=a; i<=b; i++)
			sum=sum+i;
		
		print();
	}
	
	// 출력 함수 (전역변수)
	public void print() {
		System.out.println(sum);
	}
	
	// 메소드 이용
	public void cal(int a, int b) {
		
		int sum=0; // 전역변수 sum 값이 위에 정해져서 ..?
		
		for(int i=a; i<=b; i++)
			sum=sum+i;
	
		System.out.println(sum);      // 지역변수 sum
		System.out.println(this.sum); // 전역변수 sum
		print();
	}

	
	
	
	
}
