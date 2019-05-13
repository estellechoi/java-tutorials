package test_fir;

public class datatype {

	public static void main(String[] args) {
		// byte -> 1 byte // int -> 4 byte
		
		byte a;
		a=127;
		
		int b;
		b=2147483647;
		
		long c;
		c=2147483647;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b);
		
		// 가능한 범위 내에서 낮은 단위 자료형을 쓰는 것이 좋음 (costs less memory)
		// it is better to use int than long for 2147483647.
		
		
		
		

	}

}
