package LessonA8_SortingAlgorithms;

public class MathClass {

	public static void main(String[] args) {
		
		// Math.random() → Class.method() -- static 함수

		double a = Math.random(); // return double
		long b = Math.round(1.4); // return long // 반올림 (1.5 ~ → 2)
		double c = Math.ceil(1.4); // return double // 올림
		double d = Math.floor(1.4); // return double // 내림
		
		// 형변환
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
