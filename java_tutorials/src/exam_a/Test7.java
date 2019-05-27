package exam_a;
abstract class Good
{
	int kor;
	int eng;
	int mat;
	// 과목의 합
	public abstract void hap();
	
	// 평균
	public abstract void avg();
	
	// 과목 점수 입력
	public abstract void input();
	
	// 평균과 합계 출력
	public abstract void chul();
}
// 위와 같은 추상클래스가 있다. 3과목을 입력하여
// 합,평균을 구하고 출력하는 메소드를 완성하시오.
public class Test7 extends Good
{
   int total;
   int average;
   public void hap() // Override abstract functions.
   {
	   total=kor+eng+mat;
   }
   public void avg()
   {
	   average=(kor+eng+mat)/3;
   }
   public void input()
   {
	   kor=90;
	   eng=90;
	   mat=80;
   }
   public void chul()
   {
	   System.out.println(total+" "+average);
   }
}















