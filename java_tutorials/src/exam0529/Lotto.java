package exam0529;

public class Lotto {
	
	int lotto[] = new int[6];
	
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
