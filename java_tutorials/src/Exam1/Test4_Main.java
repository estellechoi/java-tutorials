package Exam1;
public class Test4_Main {

	public static void main(String[] args) {
		   // 생성자의 접근제한자가 private이다 싱글톤을 이용하여 
		   // 객체를 생성하시오.
		
		Test4 t4 = Test4.getInstance(10,20);
		// Test4 클래스 getInstance() 함수 참조 (static)
		// → 해당 함수에서 return된 t4 객체를 참조한다 !
		
		//t4.input();
		t4.println();
		
		

	}

}
