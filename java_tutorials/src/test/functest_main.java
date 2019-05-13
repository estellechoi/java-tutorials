package test;

public class functest_main {

	public static void main(String[] args) {
		
		functest ft = new functest();
		
		ft.input();
		int sum = ft.sum(); // ft.sum(); 리턴값이 있는 함수
		
		System.out.println(sum);

	}

}
