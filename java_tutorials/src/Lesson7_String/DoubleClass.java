package Lesson7_String;

public class DoubleClass {

	public static void main(String[] args) {
		
		// JAVA에서 실수는 일단 무조건 double로 인식
		double eng = 1.5;
		
		// double > float
		
		// * 실수형
		// ⓐ 형변환
		float kor = (float)1.55555555555555555555555;
		double kor2 = 1.55555555555555555555555;
		
		// ⓑ float 형표시
		float mat = 1.5F;
		
		// * 정수형
		// ⓐ 형변환
		long aa = (long)1000000000;
		
		// ⓑ long 형표시
		long bb = 10000000000L; 
		
		System.out.println(kor);
		System.out.println(kor2);
		System.out.println(mat);
		System.out.println(aa);
		System.out.println(bb);

	}

}
