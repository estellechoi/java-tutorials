package Exam2;
//a���� b������ ���� ���ϰ� ����ϴ� ���α׷��� ���ǿ� �°� �ϼ��Ͻÿ�.
// ���� ���ؼ� ����ϴ� �޼ҵ��� �̸��� chul()
// �Ű������� ������ 1~100, �Ű������� 1���� 1~�Է°�, �Ű������� �ΰ��� �Է°� ~ �Է°�
// Ŭ���� �̿��Ͽ� �Ӽ�, �޼ҵ� ����
public class Exam6 {
	
	int start;
	int end;
	int sum;
	
	Exam6() {
		start=1;
		end=100; 
	}
	
	Exam6(int a) {
		start=1;
		end=a;
	}
	
	Exam6(int a, int b) {
		if(a<=b) {
			start=a;
			end=b;
		}
		else {
			start=b;
			end=a;
		}
	}
	public void sum() {
		for(int i=start; i<=end; i++)
			sum=sum+i;
		System.out.println(sum);
	}
}
