package Lesson7_String;

public class Split2 {

	public static void main(String[] args) {
		
		String str = "hello,hola,bon jour/Buenosdias-ca va";
		
		String greet[] = str.split(",|/|-"); // , / - �� �������� split (| : or) �� ������ �迭 ����
		
		for(int i=0; i<greet.length ; i++)
			System.out.println(greet[i]);

	}

}
