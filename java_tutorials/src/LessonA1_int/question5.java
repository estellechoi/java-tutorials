package LessonA1_int;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		//5. a���� b������ 3�� ����� ���� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A : "); int a = sc.nextInt();
		System.out.print("B : "); int b = sc.nextInt();
		
		int n = 0;	
		
		if(a<b) {
			for(int i=a;i<=b;i++) {
				if (i%3 == 0) {                            // i%2 == 0; : i�� 2�� ���� �������� 0�̴�.
					n=n+i;                               // 3�� ����� ��쿡�� i�� ���Ѵ� !!! else, nothing happens.
				}
				
			}
		}
		else {
			for(int i=b;i<=a;i++) {
				if (i%3==0) {                            
					n=n+i;
				}
				
			}
		}
		
		System.out.println(n);


	}

}
