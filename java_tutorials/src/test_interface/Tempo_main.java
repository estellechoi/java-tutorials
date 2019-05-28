package test_interface;
// *interface 임의구현 : arbitrary implement not through implement class.
import java.util.Scanner;
public class Tempo_main {

	public static void main(String[] args) {
		
		// 인터페이스는 원래 객체 생성 안되지만, 임의 구현하기 위해 가능한 방법이 있는데
		// Tempo tem =new Tempo(){ 여기 안에서 override };
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
