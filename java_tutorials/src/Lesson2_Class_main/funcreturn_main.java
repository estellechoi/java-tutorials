package Lesson2_Class_main;

public class funcreturn_main {

	public static void main(String[] args) {


		funcreturn fr = new funcreturn();
		
		fr.input();
		fr.sum();
		
		// private int sum 값은 계속 쓸 수 있나? (접근권한이 private -> return값 만들면 가능)
		
		int sum=fr.save(); // return값 있는 함수 이기 때문에 왼쪽 변수에서 받을 수 있다 !
		                    // 다른 클래스 이기 때문에, 똑같은 변수명 sum 사용 무방.
		
		System.out.println("returned sum is "+sum);

	}

}
