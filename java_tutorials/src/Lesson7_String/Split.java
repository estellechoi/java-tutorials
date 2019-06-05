package Lesson7_String;
// 문자열을 단위로 잘라서 배열로 만들기

public class Split {

	public static void main(String[] args) {
		
		String pho = "010-1234-5678";
				
		// var.split() 값은 무조건 배열로 받아야 함
		String phone[] = pho.split("-"); 
		
		//phone[0]. phone[1], phone[2];
		
		System.out.println(phone[0]);
		System.out.println(phone[1]);
		System.out.println(phone[2]);

	}

}
