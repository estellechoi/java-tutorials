package test_draft;

public class test_all {

	public static void main(String[] args) {
		
		// 1. ������ ������ �� �ִ� ���� num�� ���ڿ��� ������ �� �ִ� name�̶�� ������ ����ÿ�.
		
		test1 t1 = new test1();
		
		t1.num=77;
		t1.name="estelle";
		int num=111;
		System.out.println(t1.num);
		System.out.println(num);
		
		// 2. ����, ����, ���� 3������ ���� ������ �� �ִ� ������ ����ÿ�.
		
		test2 t2 = new test2();
		
		t2.kor=100;
		t2.eng=100;
		t2.mat=100;
		
		test2 t22 = new test2();
		
		t22.kor=99;
		t22.eng=90;
		t22.mat=90;                  // another copy, so has different values.
		
		// 3. 2�� �������� ����� ���� �հ�� ����� ���Ͻÿ�.
		
		test3 t3 = new test3();
		
		t3.input();
		t3.cal();
		t3.print();
		
		// 4. ���� ������ Scanner�� �Է� ���� ��, ������ �����ϴ� ���α׷��� ����ÿ�.
		
		Test4 t4 = new Test4();
		
		t4.input();
		System.out.print(t4.kor);
		
		// 5. ��������(0~100��)�� Scanner�� �Է� ���� ��, ABCDE�� ����Ͻÿ�. (90���̻� A 80���̻� B ..)
		
		Test5 t5 = new Test5();
		
		t5.input();
		t5.print();
		
		
		
		
	}

}
