package LessonA3_return;

public class test_all5 {

	public static void main(String[] args) {
		// 17. Scanner로 n , m 이라는 변수에 값을 입력받은 후  n부터 m까지의 합을 구하시오.

		Test17 t17 = new Test17();
		
		t17.input();
		t17.plus();
		t17.print();
		
		// 18. kor이름으로 정수형이며 크기가 6인 배열을 만드시오..
		
		Test18 t18 = new Test18();
		
		t18.kor[0]=100;
		t18.eng=50;
		
		// 19. 18번문제에 kor배열에 값을 Scanner로 입력한 후  kor배열의 내용을 출력하시오.
		
		Test19 t19 = new Test19();
		t19.input();
		t19.print();
		
		
		
		
	}
}
