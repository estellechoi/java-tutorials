package test_draft;
import java.util.Scanner;
public class Retest1 {

	// ��,��,��,���� ���� �Է� ���� �� �� ������ ������ ����Ͻÿ�. ex)����̾簡
	
	int kor;
	int eng;
	int mat;
	int sci;
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("kor: "); kor=sc.nextInt();
		System.out.println("eng: "); eng=sc.nextInt();
		System.out.println("mat: "); mat=sc.nextInt();
		System.out.println("sci: "); sci=sc.nextInt();
	}
	
	// �Ű����� (int aa) (���� �޾Ƽ� �����ϴ� ����)
	
	public void grade(int aa, String sub) {
		String result;
		if(aa>=90)
			result="��";
		else if(aa>=80)
			result="��";
		else if(aa>=70)
			result="��";
		else if(aa>=60)
			result="��";
		else
			result="��";
		System.out.println(sub+result);
	}
	
	// ���� Ŭ���� ������ ������� �Լ� �����Ű�� �Լ� !!!
	// �Ű������� ���� �־��ش� ! (int aa) > (kor)
	
	public void grade_exe() {
		grade(kor, "����: ");
		grade(eng, "����: ");
		grade(mat, "����: ");
		grade(sci, "����: ");
	}

	

}
