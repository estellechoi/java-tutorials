package exam_a;
public class Test2 
{
  int start;
  int end;
  
  // 생성자를 통해 start,end를 가져오시오(생성자 오버로딩)
  // 단 값을 입력하지 않으면 start=1 , end=45
  Test2()
  {
	 start=1;
	 end=45;
  }
  // 값이 하나만 입력되면  start=1, end=입력된값
  Test2(int end)
  {
	 start=1;
	 this.end=end;
  }
  // 값이 둘이 입력되면 처음값이 start 둘째값이 end
  Test2(int start,int end)
  {
	  this.start=start;
	  this.end=end;
  }
  public void random_gen()
  {
	  // start부터 end 까지의 임의의 값 출력하시오
	  int ch=end-start+1;
	  int ran=(int)(Math.random()*ch)+start;
	  
	  System.out.println(ran);
  }
}











