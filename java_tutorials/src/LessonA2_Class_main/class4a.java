package LessonA2_Class_main;

public class class4a {

	// 23. pkc��� �������̰� ũ�Ⱑ 10�� �迭�� �����
    // Math.random()�� �̿��Ͽ� 101~110������ ������ ���� �ְ� ��� �Ͻÿ�.
	
	int pkc[] = new int[10];                             // �� �Ӽ� �����
	
	public void random() {                               // �� �Լ� ����� random();
		for(int i=0; i<pkc.length; i++) {
			pkc[i] = (int)(Math.random()*10)+101;
			
			for(int j=0; j<=i-1; j++) {
			if(pkc[j]==pkc[i])
				i=i-1;
			}
		}
	}
	
	public void print() {                               // �� �Լ� �� ����� print();
		
		for(int i=0; i<pkc.length; i++) {
			System.out.print(pkc[i]+" ");
		}
		
	}

}