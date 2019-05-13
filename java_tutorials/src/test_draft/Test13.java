package test_draft;

public class Test13 {

	// 1부터 100까지의 짝수의 합을 출력하시오..
	
	int n=0;
	
	public void plus() {
		for(int i=0; i<=100; i++) {
			if(i%2==0)
				n=n+i;
		}
	}
	
	public void print() {
		System.out.println(n);
	}

}
