package LessonA4_Constructor;

public class ConsOver_main {

	public static void main(String[] args) {
		
		// 매개변수의 갯수에 따라 ..
		
		// 생성자 통해 kor, eng 초기값 60으로 지정했음.
		ConsOver co = new ConsOver(); 
		co.print(); 
		
		// 한 가지 변수는 매개변수로 값을 받고, 나머지 변수는 초기값 쓸 때 생성자.
		ConsOver co1 = new ConsOver(99);
		co1.print();
		
		ConsOver co2 = new ConsOver(99,88);
		co2.print();		
		

	}

}
