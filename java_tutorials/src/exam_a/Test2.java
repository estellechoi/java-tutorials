package exam_a;
public class Test2 
{
  int start;
  int end;
  
  // �����ڸ� ���� start,end�� �������ÿ�(������ �����ε�)
  // �� ���� �Է����� ������ start=1 , end=45
  Test2()
  {
	 start=1;
	 end=45;
  }
  // ���� �ϳ��� �ԷµǸ�  start=1, end=�ԷµȰ�
  Test2(int end)
  {
	 start=1;
	 this.end=end;
  }
  // ���� ���� �ԷµǸ� ó������ start ��°���� end
  Test2(int start,int end)
  {
	  this.start=start;
	  this.end=end;
  }
  public void random_gen()
  {
	  // start���� end ������ ������ �� ����Ͻÿ�
	  int ch=end-start+1;
	  int ran=(int)(Math.random()*ch)+start;
	  
	  System.out.println(ran);
  }
}











