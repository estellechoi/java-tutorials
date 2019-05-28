package test_method;
import java.util.Scanner;

//extends the abstract class. (추상클래스 상속받음)
public class Abstract2_son extends Abstract2 {

	// can extend only one class (1개 추상클래스만 상속 가능)
	// → you want more? Implement "interfaces", instead of extending.
	
	// override the abstract methods.
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("KOR score : ");
		kor=sc.nextInt();
	}
	
	public void cal() {
		if(kor>=90)
			g='A';
			else if(kor>=80)
				g='B';
			else if(kor>=70)
				g='C';
			else if(kor>=60)
				g='D';
			else
				g='E';
	}
	
	public void print() {
		System.out.println("Your grade : "+g);
	}
}
