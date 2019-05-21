package test_array;

public class method_main {

	public static void main(String[] args) {
		
		method mm = new method();
		
		// 리터값은 무조건 변수로 받는다 !!
		int v = mm.cal(100);
		v=v+1;
		System.out.println(v);

	}

}
