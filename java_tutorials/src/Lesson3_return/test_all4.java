package Lesson3_return;

public class test_all4 {

	public static void main(String[] args) {
		// 12. 1부터 88까지의 합을 출력하시오.
		
		test12 t12 =new test12();
		
		t12.plus();
		t12.print();
		
		// 13. 1부터 100까지의 짝수의 합을 출력하시오..
		
		Test13 t13 = new Test13();
		
		t13.plus();
		t13.print();
		
		// 14. 1부터 100까지의 8의 배수의 합을 출력하시오.
		
		Test14 t14 = new Test14();
		
		t14.plus();
		t14.print();
		
		// 15. 1부터 100까지의 (4의 배수의 합)-(6의 배수의합) 을 구하시오.
		
		Test15 t15 = new Test15();
		t15.plus4();
		t15.plus6();
		t15.print();
		
		// 16. Scanner로 n이라는 변수에 값을 입력받은 후  1부터 n 까지의 합을 구하시오.
		
		Test16 t16 = new Test16();
		
		t16.input();
		t16.sum();
		t16.print();
		
		
		
		

	}

}
