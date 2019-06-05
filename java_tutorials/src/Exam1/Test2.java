package Exam1;
public class Test2 
{
  int start;
  int end;
  
  // 생성자를 통해 start,end를 가져오시오(생성자 오버로딩)
  // 단 값을 입력하지 않으면 start=1 , end=45
  // 값이 하나만 입력되면  start=1, end=입력된값
  // 값이 둘이 입력되면 둘다 입력된 값
  
  Test2() {
	  this.start=1;
	  this.end=45;
  }
  
  Test2(int end) {
	  this.start=1;
	  this.end=end;
  }
  
  Test2(int start, int end) {
	  this.start=start;
	  this.end=end;
  }
  
  public void random_gen()
  {
	  // start부터 end 까지의 임의의 값 출력하시오
	  
	  int ran = (int)(Math.random()*(end-start+1))+start;
	  System.out.println(ran);
  }
}
