package Lesson7_String;
// ���ڿ��� ������ �߶� �迭�� �����

public class Split {

	public static void main(String[] args) {
		
		String pho = "010-1234-5678";
				
		// var.split() ���� ������ �迭�� �޾ƾ� ��
		String phone[] = pho.split("-"); 
		
		//phone[0]. phone[1], phone[2];
		
		System.out.println(phone[0]);
		System.out.println(phone[1]);
		System.out.println(phone[2]);

	}

}
