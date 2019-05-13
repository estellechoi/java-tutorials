package test_fir;

public class operators3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		System.out.println(a/b); // 정수값으로 출력되고, 소수점 이후 부분은 손실
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(c/d); // float/float 실수 형태로 출력됨
		System.out.println(a/d); // * 형변환의 원칙 : 더 정밀하거나 큰 수를 표현할 수 있는 자료형으로 형변환 !
		
		

	}

}
