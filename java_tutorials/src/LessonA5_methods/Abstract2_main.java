package LessonA5_methods;

public class Abstract2_main {
	
	public static void main(String[] args) {
	
	// Abstract2 ab = new Abstract2();

	// ¡Ø cannot copy abstract class as it having abstract methods.
	//    abstract methods don't have {} so cannot be copied.
	
		Abstract2_son aa = new Abstract2_son();
		
		aa.input(); // why not working ????????????????????
		aa.cal();
		aa.print();

	}
}
