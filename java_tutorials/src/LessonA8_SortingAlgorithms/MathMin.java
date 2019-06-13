package LessonA8_SortingAlgorithms;
import java.util.Scanner;
public class MathMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input 2 numbers.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int start = Math.min(a,b);
		int end = Math.max(a,b);
		
		int total=0;
		
		for(int i=start; i<=end; i++)
			total=total+i;
		
		System.out.println(total);

	}

}
