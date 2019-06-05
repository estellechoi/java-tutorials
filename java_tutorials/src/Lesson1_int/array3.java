package Lesson1_int;

public class array3 {

	public static void main(String[] args) {
		
		// variable, array > the space where values are saved. 
		// * Variable : save one value in it.
		// * Array : a group of values under same attribute. + use with for ()
		
		// Controlling Statements > if, switch, for, while
		// Branching Statement  > if (condition equation), switch (variable)
		// Repeating Statement > for (default value; condition; increase value)
		//                     > in case of array, default is always 0 !
		
		int ar[] = new int [6];
		
		for (int i=0; i<ar.length; i++)
		{
			
			ar[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<=i-1; i++)
			{
			if (ar[j]==ar[i])
				{
				i=i-1;
				}
			}
			
		}
		
		for (int i=0; i<ar.length; i++)
		{
			
		System.out.println(ar[i]+" ");
		}
		
	}

}
