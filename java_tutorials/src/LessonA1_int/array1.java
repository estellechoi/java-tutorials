package LessonA1_int;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		
		
		// When lots of variables are needed !	
		// Array is a group of variables, with array name and index no.	
		// index no. 0 ~ ; the number of array indexes is 10, which means index.0 ~ 9 !
		
		//How to make an array
		
		// type [] name = {val,val,val,val, .., val};
		
		int[] kor = {100, 99, 50, 95, 85}; // index.0~4 (left to right)
		
		// when no value for variables
		// declare the size of array; 5 variables.
		
		int[] eng = new int[5];
		
		eng[0]=30;                   // the value of index.0 is 30.
		eng[0]=eng[0]+100;
		System.out.println(eng[0]);
		System.out.println(eng[1]);  //  the default value for each index is 0, if not declared yet.
		
		
		// QQQQQ 5개의 값을 입력 받고, 5개의 값을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int a1= sc.nextInt();
		int a2= sc.nextInt();
		int a3= sc.nextInt();
		int a4= sc.nextInt();
		int a5= sc.nextInt();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		// Use array.
		
		int arr[] = new int [5]; // making an array named arr, with 5 variables.
		
		for(int i=0;i<=4;i++) {    // a[0] ~ a[4] = sc.nextInt();
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<=4;i++) {
			System.out.println(arr[i]);
		}
		
		// 부록
		
		int num[] = new int[4];
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 40;
		num[3] = 60;
		
		// 부록
		
		int scr[] = new int[4];
		
		scr[0]=sc.nextInt();
		scr[1]=sc.nextInt();
		scr[2]=sc.nextInt();
		scr[3]=sc.nextInt();
		
		// ** Array was made to use with 'for' function.
		
		for(int i=0;i<=3;i++) {
			scr[i]=sc.nextInt();
		}
		
		

	}

}
