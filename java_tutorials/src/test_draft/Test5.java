package test_draft;
import java.util.Scanner;
public class Test5 {

	// 5. ��������(0~100��)�� Scanner�� �Է� ���� ��, ABCDE�� ����Ͻÿ�. (90���̻� A 80���̻� B ..)
	
	int eng;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		eng=sc.nextInt();
	}
	
	public void print() {
		String result=null;
		if(eng>=90)
			result="A";
		else if(eng>=80)
			result="B";
		else if(eng>=70)
			result="C";
		else if(eng>=60)
			result="D";
		else
			result="E";
		
		System.out.println(result);
			
	}
	

}
