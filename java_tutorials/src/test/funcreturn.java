package test;

import java.util.Scanner;

public class funcreturn {

	
	int n1;
	int n2;
	private int sum; // 변수 접근권한 : private (이 클래스 안에서만 접근 가능 -> 다른 클래스에서 접근못함!)
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
	}
	
	public void sum() {
		sum=n1+n2;
	}
	
	public int save() { // sum값을 return 하려면, 해당 변수 sum의 자료형인 int
		return sum;     // return은 항상 변수 1개만 보낼 수 있음.
	}
}
