package Lesson3_return;

public class Test22 {

	// 22. test라는 정수형이고 크기가 10인 배열을 만들어
    // Math.random()을 이용하여 1~10까지의 임의의 수를 넣고 출력을 하시오..
	
	int test[]= new int[10];
	
	public void random() {
		for(int i=0; i<test.length; i++) {
			test[i]=(int)(Math.random()*10)+1;
			for(int j=0; j<=i-1; j++) {
				if(test[j]==test[i])
					i=i-1;
			}
		}
	}
	
	public void blank() {
		System.out.println(" ");
	}
	
	public void print() {
		for(int i=0; i<test.length; i++)
			System.out.print(test[i]+" ");
	}
	
	
	
}

