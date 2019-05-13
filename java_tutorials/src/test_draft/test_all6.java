package test_draft;

public class test_all6 {

	public static void main(String[] args) {
		// 20. pay라는 배열에 {100,200,150,55,88,95,56,96,88}의 값을 입력하고
		// 총합을 구해서 출력하시오..
		
		Test20 t20 = new Test20();
		
		t20.sum();
		t20.print();
		
		// 21. lotto라는 정수형이고 크기가 6인 배열을 만들어 
	    // Math.random()을 이용하여 1~45까지의 임의의 수를 넣으시오.
		
		Test21 t21 = new Test21();
		
		t21.random();
		t21.print();
		
		// 22. test라는 정수형이고 크기가 10인 배열을 만들어
	    // Math.random()을 이용하여 1~10까지의 임의의 수를 넣고 출력을 하시오.
		
		Test22 t22 = new Test22();
		
		t22.blank();
		t22.random();
		t22.print();
		
		// 23. pkc라는 정수형이고 크기가 10인 배열을 만들고
	    // Math.random()을 이용하여 101~110까지의 임의의 수를 넣고 출력 하시오.
		
		Test23 t23 = new Test23();
		
		t23.blank();
		t23.random();
		t23.print();
		t23.blank();
		
		// 23. aa라는 정수형 배열
	    // Math.random()을 이용하여 n~m 까지 임의의 수를 넣고 출력 하시오.
		
		Test23_r trr = new Test23_r();
		
		trr.input();
		trr.random();
		trr.print();
		t23.blank();
		
		
		
	
	}
}
