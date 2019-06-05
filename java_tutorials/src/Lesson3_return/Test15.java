package Lesson3_return;

public class Test15 {

	// 15. 1부터 100까지의 (4의 배수의 합)-(6의 배수의합) 을 구하시오..
	
	int n1=0;
	int n2=0;
	
	public void plus4() {
		for(int i=0; i<=100; i++) {
			if(i%4==0)
				n1=n1+i;
		}
	}
	
	public void plus6() {
		for(int i=0; i<=100; i++) {
			if(i%6==0)
				n2=n2+i;
		}
	}
	
	public void print() {
		System.out.print(n1-n2);
	}

}
