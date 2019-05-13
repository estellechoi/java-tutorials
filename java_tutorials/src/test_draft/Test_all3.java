package test_draft;

public class Test_all3 {

	public static void main(String[] args) {
		// 9.  num1=99,  num2=88 이라는 숫자가 저장되어 있다고 할때 두변수의 값을 교환하시오.
		//	( num1=88 , num2=99)
		
		Test9 t9 = new Test9();
		
		t9.exchange();
		t9.print();
		
		// 10. Scanner를 통해 num1,num2라는 변수에 값을 저장한 후 둘중에 큰수를 출력하시오..
		
		Test10 t10 = new Test10();
		
		t10.input();
		t10.print();
		
		// 11. Scanner를 통해 num1,num2,num3의 변수에 값을 저장한 후 높은 값부터 순서대로 출력하시오.

		Test11 t11 = new Test11();
		
		t11.input();
		t11.print();
		
	}

}
