package LessonA5_methods;

public class Overriding_main {

	public static void main(String[] args) {
		
		Overriding_son ex = new Overriding_son();
		
		ex.aa();
		ex.print(); // 부모 함수의 내용이 아닌, 오버라이딩(자식에서 수정된) 함수 실행
		ex.print(100); // 오버로딩
		

	}

}
