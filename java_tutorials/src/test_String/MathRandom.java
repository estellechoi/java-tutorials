package test_String;
import java.util.Scanner;
public class MathRandom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lot[] = new int[6];
		int num =0;
		
	
		for(int i=0; i<lot.length; i++) {
			lot[i]=(int)(Math.random()*45)+1;
			
				for(int j=0; j<=i-1; j++){
					  if(lot[j]>=lot[i])
						  i=i-1;
				}
			}
		for(int i=0; i<lot.length; i++)
			System.out.print(lot[i]+" ");


	}

}
