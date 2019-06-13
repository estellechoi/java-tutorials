package LessonA4_Constructor;

public class ConsOver3 {
	
	int sum;

	ConsOver3() {
		this(1,100); // ConsOver3 매개변수 2개짜리 호출 !
	}
	
	
	ConsOver3(int a) {
		this(1,a); // ConsOver3 매개변수 2개짜리 호출 !
	}
	
	ConsOver3(int a, int b) {
		for(int i=a; i<=b; i++)
			sum=sum+i;
	}
	
	// method
	public void print() {
		System.out.println(sum);
	}
	

}
