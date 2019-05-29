package exam0529;
// 증감연산자가 들어가게 해서 1부터 10까지의 합을 구해 출력하는 프로그램을 제작하고
// console화면으로 출력하시오.
public class Exam2 {

	public static void main(String[] args) {
		
		int total=0;
		
		for(int i=1; i<=10; i++)
			total=total+i;
		
		System.out.println(total);

	}

}
