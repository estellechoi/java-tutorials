package test_draft;
import java.util.Scanner;
public class Test19 {

	// 19. 18번문제에 kor배열에 값을 Scanner로 입력한 후  kor배열의 내용을 출력하시오..
	
	Scanner sc = new Scanner(System.in);
	int kor[] = new int[6];
	
	public void input() {
		for(int i=0; i<kor.length; i++)
			kor[i]=sc.nextInt();
	}
	
	public void print() {
		for(int i=0; i<kor.length; i++)
			System.out.print(kor[i]+" ");
	}
	
	
}
