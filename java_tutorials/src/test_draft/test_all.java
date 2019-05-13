package test_draft;

public class test_all {

	public static void main(String[] args) {
		
		// 1. 정수를 저장할 수 있는 변수 num과 문자열을 저장할 수 있는 name이라는 변수를 만드시오.
		
		test1 t1 = new test1();
		
		t1.num=77;
		t1.name="estelle";
		int num=111;
		System.out.println(t1.num);
		System.out.println(num);
		
		// 2. 국어, 영어, 수학 3과목의 값을 저장할 수 있는 변수를 만드시오.
		
		test2 t2 = new test2();
		
		t2.kor=100;
		t2.eng=100;
		t2.mat=100;
		
		test2 t22 = new test2();
		
		t22.kor=99;
		t22.eng=90;
		t22.mat=90;                  // another copy, so has different values.
		
		// 3. 2번 문제에서 저장된 값의 합계와 평균을 구하시오.
		
		test3 t3 = new test3();
		
		t3.input();
		t3.cal();
		t3.print();
		
		// 4. 국어 점수를 Scanner로 입력 받은 후, 변수에 저장하는 프로그램을 만드시오.
		
		Test4 t4 = new Test4();
		
		t4.input();
		System.out.print(t4.kor);
		
		// 5. 영어점수(0~100점)를 Scanner로 입력 받은 후, ABCDE를 출력하시오. (90점이상 A 80점이상 B ..)
		
		Test5 t5 = new Test5();
		
		t5.input();
		t5.print();
		
		
		
		
	}

}
