package test_etc;

public class currentTimeMillis {

	public static void main(String[] args) {
		
		// System.currentTimeMillis();
		// �ý��� �ð迡�� �ð��� �о���� �޼ҵ� (�и���Ŀ��(ms) ������ �о��)
		// 1970�� 1�� 1�Ϻ��� 1�ʾ� ���°�...
		
		long time = System.currentTimeMillis()*1/1000*1/60*1/24*1/31;
		long x = System.currentTimeMillis();
		
		// System.out.println(time);
		System.out.println(time);


	}
}
