package LessonA1_int;
import java.util.Scanner; // need to be imported from java.util to make the copy of Scanner class.
public class input_output {

	public static void main(String[] args) {
		
		// how to output a value.
		
		System.out.println("Hello.");
		System.out.println(1234);
		int kor=100;
		System.out.println(kor);
		System.out.println(100+90); // formulas can be printed like this (100+90);
		System.out.println((10+2)/6);
		System.out.println("Hello, "+"girl.");
		
		
		// how to input a value.
		
		// Let's name the copy of Scanner class 'sc' !
		// The copy 'sc' can do every function just like original Scanner.
		
		Scanner sc = new Scanner(System.in); // make a copy(°´Ã¼º¯¼ö) of Scanner class.
		
		// Bring the input value through a method (sc.nextInt();)
		// Put the method into the variable n. (int n=sc.nextInt();)
		
		int n = sc.nextInt();
		

	}

}
