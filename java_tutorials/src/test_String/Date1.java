package test_etc;
import java.util.Date; // import !

public class Date1 
{
  public static void main(String[] args)
  {
	  Date today=new Date();
	  
	  System.out.println(today.getMonth()); // 0 (1��) ~
	  
	  today=null; // �� �̻� ������� �����Ƿ� null ���� �ش�..
	  
	  System.gc(); // ???
	 
  }

}