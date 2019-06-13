package LessonA4_Constructor;

public class Array2 {

	public static void main(String[] args) {
		
		// arr1[]  = {1,2,3,4,5,6}
		
		int arr1[] = new int[6];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=i+1;
			System.out.print(arr1[i]);
		}
		
		System.out.println(" ");
		
		// arr2[] = {6,5,4,3,2,1}
		
		int arr2[] = new int[6];
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=6-i;
			System.out.print(arr2[i]);
		}
		
		System.out.println(" ");
		
		// arr3[] = {1~6 임의의 값} 크기 6 배열

		int arr3[] = new int[6];
		for(int i=0; i<arr3.length; i++) {
			arr3[i]=(int)(Math.random()*6)+1;
			System.out.print(arr3[i]);
		}
		
		System.out.println(" ");
		
		// arr4[] = {1~6 임의의 값} 크기 6 배열, 6개 값의 합 ?
		
		int arr4[] = new int[6];
		int sum=0;
		for(int i=0; i<arr4.length; i++) {
			arr4[i]=(int)(Math.random()*6)+1;
			sum=sum+arr4[i];
			System.out.print(arr4[i]);
		}
		
		System.out.println(" ");
		System.out.print("The sum is "+sum);
		
			
	}

}
