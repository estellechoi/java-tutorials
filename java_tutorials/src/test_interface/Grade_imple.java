package test_interface;
// * ����Ŭ���� : �������̽��� �����ϱ� ���� Ŭ����
// it's mandatory to override every abstract method from interface.
import java.util.Scanner;
public class Grade_imple implements Grade {
	
	int eng;
	String result;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENG score : ");
		eng=sc.nextInt();
	}
	
	public void cal() {
		if(eng>=90)
			result=a;
		else if(eng>=80)
			result=b;
		else if(eng>=70)
			result=c;
		else if(eng>=60)
			result=d;
		else
			result=e;
	}
	
	public void print() {
		System.out.println(result);
	}

}
