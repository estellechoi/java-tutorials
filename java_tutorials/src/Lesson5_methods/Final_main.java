package Lesson5_methods;

public class Final_main {

	public static void main(String[] args) {
		
		Final f = new Final();
		f.eng=100;
		// f.kor=100; // cannot give any value, it has a "final" value 
		f.print();
		
		System.out.println(Final.mat);
		// call without ��ü like f here, it's static.
		// Ŭ������,�����

	}

}
