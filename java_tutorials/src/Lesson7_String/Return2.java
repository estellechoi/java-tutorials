package Lesson7_String;

public class Return2 {
	
	// void �� return X 
	public void aa(int a, int b) { 
		if(a>b)
			System.out.println("ù��° ���� ũ��");
		else if (a==b)
			System.out.println("�� ���� ����");
		else
		    System.out.println("�ι�° ���� ũ��");
	}
	
	// int �� return O
	public int bb(int a,int b) {
		if(a>=b)
			 return a;
		else
			 return b;
	}
	
	
	public static void main(String[] args) {
	    
		Return2 r2 = new Return2();
	    
		// �Լ� ȣ��
		r2.aa(90, 100);
	    
		// ���ϰ��� ������ ������ ���� �� ����, ��µ� �Ұ���.
		System.out.println(r2.aa(90, 100));
		int n = r2.aa(90, 100);
		
		// ���ϰ��� ������ �Լ�
		int m = r2.bb(88, 99);
		System.out.println(m);
	    System.out.println(r2.bb(88, 99));
	    
	}

}
