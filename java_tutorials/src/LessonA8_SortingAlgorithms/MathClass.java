package LessonA8_SortingAlgorithms;

public class MathClass {

	public static void main(String[] args) {
		
		// Math.random() �� Class.method() -- static �Լ�

		double a = Math.random(); // return double
		long b = Math.round(1.4); // return long // �ݿø� (1.5 ~ �� 2)
		double c = Math.ceil(1.4); // return double // �ø�
		double d = Math.floor(1.4); // return double // ����
		
		// ����ȯ
		int x = (int)a;
		
		// wrapper class
		Double aa = a;             // Double dd = Math.floor(1.4);
		int y = aa.intValue();     // int yy = dd.intValue();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(x);
		System.out.println(y);
		

	}

}
