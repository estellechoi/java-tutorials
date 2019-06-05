package Lesson1_int;
import java.util.Scanner;
public class quest19 {

	public static void main(String[] args) {
		// 19. 18번문제에 kor배열에 값을 Scanner로 입력한 후  kor배열의 내용을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input 6 values. ");
		
		int kor[] = new int[6];
		
		for(int i=0; i<kor.length; i++) {
			kor[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<kor.length; i++) {
		System.out.print(kor[i]+" ");
		
		}

	}

}
