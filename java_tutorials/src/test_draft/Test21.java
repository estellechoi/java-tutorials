package test_draft;

public class Test21 {

	// 21. lotto라는 정수형이고 크기가 6인 배열을 만들어 
    // Math.random()을 이용하여 1~45까지의 임의의 수를 넣으시오..
	
	int lotto[]= new int[6];
	
	public void random() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			
			for(int j=0; j<=i-1; j++) {
				if(lotto[j]==lotto[i])
					i=i-1;
			}
		}
	}
	
	public void print() {
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i]+" ");
	}
	
	
	
}
