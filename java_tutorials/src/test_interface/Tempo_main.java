package test_interface;
// *interface ���Ǳ��� : arbitrary implement not through implement class.
import java.util.Scanner;
public class Tempo_main {

	public static void main(String[] args) {
		
		// �������̽��� ���� ��ü ���� �ȵ�����, ���� �����ϱ� ���� ������ ����� �ִµ�
		// Tempo tem =new Tempo(){ ���� �ȿ��� override };
		Tempo tem =new Tempo() 
		{
			int x;
			
			// override methods
			public void input() {
				Scanner sc = new Scanner(System.in);
				x=sc.nextInt();
			}
		};
		
		tem.input();
		

	}

}
