package test;

import java.util.Scanner;

public class funcreturn {

	
	int n1;
	int n2;
	private int sum; // ���� ���ٱ��� : private (�� Ŭ���� �ȿ����� ���� ���� -> �ٸ� Ŭ�������� ���ٸ���!)
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
	}
	
	public void sum() {
		sum=n1+n2;
	}
	
	public int save() { // sum���� return �Ϸ���, �ش� ���� sum�� �ڷ����� int
		return sum;     // return�� �׻� ���� 1���� ���� �� ����.
	}
}
