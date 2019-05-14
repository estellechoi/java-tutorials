package test_array;

public class Array1 {

	public static void main(String[] args) {
		// 정수형 크기 5인 test 배열을 만드시오.
		
		int[] test= new int[5];
		
		// 배열 저장공간 1 ~ 5까지의 값 입력하시오.
		

		
		for(int i=0; i<test.length; i++)
			test[i]=i+1;
		
		
		// 배열 값을 순서대로 출력하시오.
		
		for (int i=0; i<test.length; i++)
			System.out.println(test[i]);
		
		
		//arr 이름의 정수형 배열 크기는 5
		
		int arr[] =new int[5];
		
		// 1~5 값을 역으로 입력
		
		/*
		for(int i=0; i<arr.length; i++)
		   arr[i]=5-i;
		*/
		
		for(int i=arr.length-1; i>=0; i--)
			arr[i]=5-i;
		
		
		// 출력
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		

	}

}
