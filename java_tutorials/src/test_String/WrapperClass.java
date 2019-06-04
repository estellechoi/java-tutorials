package test_String;

public class WrapperClass {

	public static void main(String[] args) {
		
		// * 포장 클래스 (Wrapper Class)
		// : wrap values with class(boxing)
		//   and get the values out of the class and put into variables (unboxing)
		// * why need boxing ? To use the methods made in wrapper classes.
		
		// 기본타입
		// 정수형 : byte short int long
		// 실수형 : float double
		// T/F : boolean
		
		// 포장클래스
		// Byte, Character, Short, Integer, Long, Float, Double, Boolean
		
		// boxing		
		Integer a = new Integer(20);
		
		// unboxing
		int num = a.intValue();
		System.out.println(a+" "+num);
		
		// boxing
		Boolean b = new Boolean("0");
		
		// unboxing
		boolean result = b.booleanValue();
		System.out.println(b+" "+result);
		

	}

}
