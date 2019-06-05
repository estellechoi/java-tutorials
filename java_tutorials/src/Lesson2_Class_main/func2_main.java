package Lesson2_Class_main;

public class func2_main {

	public static void main(String[] args) {
		
		func2 f2 = new func2();
		
		f2.sum1(); // ⓐ함수 내에서 값 입력
		f2.print();
		
		f2.sum2(4,5); // ⓑ매개변수 함수이므로, 값을 줘야한다
		f2.print();

	}

}
