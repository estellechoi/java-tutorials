package test;

import java.util.Scanner;

public class func1 {


		// Ŭ������ �Ӽ��� �޼ҵ�� �����ȴ� ...
		// ��������ϴ� ���α׷��� �ʿ��� �Ӽ�, �޼ҵ�
		// �Ӽ� -> �� : �⺻����, �迭, ��ü����(���纻 ..)
		// �޼ҵ� -> ��� : function() {}
		
		// �� ���� �Է¹ް�, ���� ����϶�.
	
		int n1;
		int n2;
		int sum;
		
		// ���ٱ���(public) ����/����(static) �����ڷ���(void) function() {       }
		// void : do not save any return value after a function ends.
		// �Ű����� : a value is brought when a function needs it when being operated.
		// ���ϰ� : return value means the result of operating a function.
		// (* ���� �Լ��� ���� �� ����Ǹ�, �� ����/���� ��� ����� !)
		
		public void input() {    
			Scanner sc= new Scanner(System.in);
			
			n1=sc.nextInt();
			n2=sc.nextInt();
			
		}
		
		public void sum() {
			sum=n1+n2;
		}
		
		public void print() {
			System.out.println("The sum is "+sum);
		}
		
		//�Ű������� �ִ� �Լ� ������ ( �Ű����� makes code cleaner)
		
		int total;
		
		public void total(int n3, int n4) {
			total=n3+n4;
		}
		
		public void print2() {
			System.out.println("The total is "+total);
		}

	
	}


