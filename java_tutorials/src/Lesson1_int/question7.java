package Lesson1_int;
import java.util.Scanner;
public class question7 {

	public static void main(String[] args) {

		//7. ���̸� �Է¹��� �� 10���̸� "���İ�Ƽ", 20���̸� "�δ��",30���̸�
		//"�Ҵ߹�", 40���̸� "��ġȸ", 50���̸� "�޲ٹ̺Ұ��"�� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How old are you? "); int age = sc.nextInt();
		
		String result = null;                                           // null; default value for String !!!!
		
		if (age<=19) {
			result="Spagetti";
		}
		else if (age<=29) {
			result="Budae";
		}
		else if (age<=39) {
			result="Buldack";
		}
		else if (age<=49) {
			result="chamchi";
		}
		else if (age<=59) {
			result="Bulgogi";
		}
		
		System.out.println(result);
		
		// Print using switch.
		
		age = age/10;
		
		switch (age) {                                            //10~19 ���ڸ� 10 ���� ���� ���� int ������ ��Ÿ���� �׻� 1
			case 1: System.out.println("Spagetti"); break;
			case 2: System.out.println("Budae"); break;
			case 3: System.out.println("Buldack"); break;
			case 4: System.out.println("chamchi"); break;
			case 5: System.out.println("Bulgogi"); break;
			default: System.out.println("Wrong Input !");
		}
		
		// �η�
		
		String str = "g";
		// String ���ǽ� *** ���� ���� 7�� ?? ���� !! if (str.equals)
				

	}

}
