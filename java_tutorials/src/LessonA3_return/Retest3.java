package LessonA3_return;
import java.util.Scanner;
public class Retest3 {

	// "�ݰ����ϴ� �̸�" ����ϱ�
	
	Scanner sc = new Scanner(System.in);
	String name[] = new String[6];
	
	public void input() {
		for(int i=0; i<name.length; i++)
			name[i]=sc.next();
	}
	
	public void print(String str) {
		System.out.println("Hello, "+str+".");
	}
	
	public void print_exe() {
		for(int i=0; i<name.length; i++)
			print(name[i]);
	}
	

}
