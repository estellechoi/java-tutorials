package Lesson7_String;

public class Split2 {

	public static void main(String[] args) {
		
		String str = "hello,hola,bon jour/Buenosdias-ca va";
		
		String greet[] = str.split(",|/|-"); // , / - 를 기준으로 split (| : or) → 무조건 배열 생성
		
		for(int i=0; i<greet.length ; i++)
			System.out.println(greet[i]);

	}

}
