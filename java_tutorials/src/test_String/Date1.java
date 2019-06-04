package test_etc;
import java.util.Date; // import !

public class Date1 
{
  public static void main(String[] args)
  {
	  Date today=new Date();
	  
	  System.out.println(today.getMonth()); // 0 (1월) ~
	  
	  today=null; // 더 이상 사용하지 않으므로 null 값을 준다..
	  
	  System.gc(); // ???
	 
  }

}