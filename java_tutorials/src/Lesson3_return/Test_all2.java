package Lesson3_return;

public class Test_all2 {

	public static void main(String[] args) {
		// 6. 수학 점수를 Scanner로 입력받은 후, 60점 이상이면 "합격"을 출력하고 60점 미만이면 "불합격" 출력하시오.
		
		Test6 t6 = new Test6();
		
		t6.input();
		t6.print();
		
		// 7. 국,영,수의 점수를 Scanner로 입력받은 후 새로운 선택값을 1,2,3 중에 하나를 입력받아서
		// 1이 입력되면 국어점수를 출력 2를 입력받으면 영어점수를 출력, 3을 입력받으면 수학 점수를 출력하시오.
		
		Test7 t7 = new Test7();
		
		t7.input();
		t7.print();
		
		// 8. 7번 문제에서 각 과목 점수대신 수,우,미,양,가를 출력하시오.
		
		Test8 t8 = new Test8();
		t8.input();
		t8.result();
		t8.print();
		
		// 8 매개변수 활용.
		
		Test8_r tr = new Test8_r();
		
		tr.input();
		tr.print();
		
		//
		
		tr.result(70,"score: 70/ ");
		tr.result(tr.eng,"eng: ");
	

	}

}
