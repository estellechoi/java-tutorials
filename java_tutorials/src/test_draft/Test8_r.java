package test_draft;
import java.util.Scanner;
public class Test8_r {

	// use �Ű�����.
	
	int kor;
	int eng;
	int mat;
	int sel;
	Scanner sc = new Scanner(System.in); 
	
	// �Է� �Լ�
	public void input() {
				
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		System.out.println(" 1:kor, 2:eng, 3:mat ");
		sel=sc.nextInt();
	}
	
	// ���� �Լ� with �Ű�����
	public void result(int s, String str) {
		String result=null;
			if(s>=90)
				result="A";
			else if(s>=80)
				result="B";
			else if(s>=70)
				result="C";
			else if(s>=60)
				result="D";
			else
				result="E";
			System.out.println(str+result);
		}
	
	
	// ����Լ�
	public void print() {
		switch(sel) {
		case 1: result(kor,"kor: "); break; // �Լ� in �Լ�
		case 2: result(eng,"eng: "); break;
		case 3: result(mat,"mat: "); break;
		default: System.out.print("Wrong Input!");
		}
			
	}


}
