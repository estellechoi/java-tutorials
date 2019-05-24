package test_method;
import java.util.Scanner;
// a class extending abstract class has to do override necessarily.
// means more than one time.
public class Abstract_son extends Abstract{

	// let's override input() (extended one from abstract class).
	public void input() {
		Scanner sc = new Scanner(System.in);
		kor=sc.nextInt();
	}
}
