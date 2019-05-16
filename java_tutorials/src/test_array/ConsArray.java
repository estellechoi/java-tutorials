package test_array;

public class ConsArray {

	int arr[];
	
	// 생성자 통해 배열 객체 생성 (배열크기 등 ..)
	ConsArray(int n) {
		
		arr =new int[n];
		
	}
	
	// 메소드 통해 배열 객체 생성
	public void init(int n) {
		
		arr =new int[n];
		
	}
}
