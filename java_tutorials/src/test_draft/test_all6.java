package test_draft;

public class test_all6 {

	public static void main(String[] args) {
		// 20. pay��� �迭�� {100,200,150,55,88,95,56,96,88}�� ���� �Է��ϰ�
		// ������ ���ؼ� ����Ͻÿ�..
		
		Test20 t20 = new Test20();
		
		t20.sum();
		t20.print();
		
		// 21. lotto��� �������̰� ũ�Ⱑ 6�� �迭�� ����� 
	    // Math.random()�� �̿��Ͽ� 1~45������ ������ ���� �����ÿ�.
		
		Test21 t21 = new Test21();
		
		t21.random();
		t21.print();
		
		// 22. test��� �������̰� ũ�Ⱑ 10�� �迭�� �����
	    // Math.random()�� �̿��Ͽ� 1~10������ ������ ���� �ְ� ����� �Ͻÿ�.
		
		Test22 t22 = new Test22();
		
		t22.blank();
		t22.random();
		t22.print();
		
		// 23. pkc��� �������̰� ũ�Ⱑ 10�� �迭�� �����
	    // Math.random()�� �̿��Ͽ� 101~110������ ������ ���� �ְ� ��� �Ͻÿ�.
		
		Test23 t23 = new Test23();
		
		t23.blank();
		t23.random();
		t23.print();
		t23.blank();
		
		// 23. aa��� ������ �迭
	    // Math.random()�� �̿��Ͽ� n~m ���� ������ ���� �ְ� ��� �Ͻÿ�.
		
		Test23_r trr = new Test23_r();
		
		trr.input();
		trr.random();
		trr.print();
		t23.blank();
		
		
		
	
	}
}
