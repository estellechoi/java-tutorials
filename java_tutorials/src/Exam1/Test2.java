package Exam1;
public class Test2 
{
  int start;
  int end;
  
  // �����ڸ� ���� start,end�� �������ÿ�(������ �����ε�)
  // �� ���� �Է����� ������ start=1 , end=45
  // ���� �ϳ��� �ԷµǸ�  start=1, end=�ԷµȰ�
  // ���� ���� �ԷµǸ� �Ѵ� �Էµ� ��
  
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
	  // start���� end ������ ������ �� ����Ͻÿ�
	  
	  int ran = (int)(Math.random()*(end-start+1))+start;
	  System.out.println(ran);
  }
}
