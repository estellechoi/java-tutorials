package LessonA1_int;

public class Unary {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;

		int xx = ++x; // x = x+1 �� xx = x+1
		int yy = y++; // yy = y �� y = y+1

		System.out.println(x + " " + y);
		System.out.println(xx + " " + yy);

	}

}
