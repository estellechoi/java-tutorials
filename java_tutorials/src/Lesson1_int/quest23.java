package Lesson1_int;

public class quest23 {

	public static void main(String[] args) {
		// 23. pkc라는 정수형이고 크기가 10인 배열을 만들고
	    // Math.random()을 이용하여 101~110까지의 임의의 수를 넣고 출력 하시오.
		
		int pkc [] = new int [10];
		
		for (int i=0; i<pkc.length; i++) {
			pkc[i] = (int)(Math.random()*10)+101;
			System.out.print(pkc[i]+" ");
		}
		

	}

}
