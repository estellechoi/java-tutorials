package LessonB7_Private;

public class getter_setter_main {

	public static void main(String[] args) {
		getter_setter gs = new getter_setter();
//		gs.kor = 100;

		gs.setKor(90);
		int kor = gs.getKor();
		System.out.println(kor);

	}

}
