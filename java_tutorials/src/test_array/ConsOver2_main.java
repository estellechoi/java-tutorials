package test_array;

public class ConsOver2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ⓑ ConsOver2 co2 = new ConsOver2();
		//    needs ConsOver2(){} (매개변수없는 생성자) before.
		//    Have to create artificially. 
		
		ConsOver2 c1 = new ConsOver2();
		c1.print();
		
		ConsOver2 c2 = new ConsOver2(100);
		c2.print();
		
		ConsOver2 c3 = new ConsOver2(1,100);
		c3.print();

	}

}
