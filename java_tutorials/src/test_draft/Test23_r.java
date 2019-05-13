package test_draft;
import java.util.Scanner;
public class Test23_r {

	Scanner sc= new Scanner(System.in);
	int n;
	int m;
	int diff;
	
	public void input() {
		System.out.println("m : "); m=sc.nextInt();
		System.out.println("n : "); n=sc.nextInt();
		if(n<m)
			diff=m-n+1;
		else
			diff=n-m+1;
	}
	
	int aa[];
	
	public void random() {
		
		aa= new int[diff];
		
		for(int i=0; i<aa.length; i++) {
			if(n<m)
				aa[i]=(int)(Math.random()*diff)+n;
			else
				aa[i]=(int)(Math.random()*diff)+m;	
		}
	}

	public void print() {
		for(int i=0; i<aa.length; i++)
			System.out.print(aa[i]+" ");
	}

}
