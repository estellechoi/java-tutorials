package Lesson1_int;
import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {

		//7. 나이를 입력받은 후 10대이면 "스파게티", 20대이면 "부대찌개",30대이면
		//"불닭발", 40대이면 "참치회", 50대이면 "쭈꾸미불고기"를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How old are you? "); int age = sc.nextInt();
		
		String result = null;                                           // null; default value for String !!!!
		
		if (age<=19) {
			result="Spagetti";
		}
		else if (age<=29) {
			result="Budae";
		}
		else if (age<=39) {
			result="Buldack";
		}
		else if (age<=49) {
			result="chamchi";
		}
		else if (age<=59) {
			result="Bulgogi";
		}
		
		System.out.println(result);
		
		// Print using switch.
		
		age = age/10;
		
		switch (age) {                                            //10~19 숫자를 10 으로 나눈 값을 int 값으로 나타내면 항상 1
			case 1: System.out.println("Spagetti"); break;
			case 2: System.out.println("Budae"); break;
			case 3: System.out.println("Buldack"); break;
			case 4: System.out.println("chamchi"); break;
			case 5: System.out.println("Bulgogi"); break;
			default: System.out.println("Wrong Input !");
		}
		
		// 부록
		
		String str = "g";
		// String 조건식 *** 동빈나 강의 7강 ?? 참조 !! if (str.equals)
				

	}

}
