package LessonA5_methods;

public class Final {
	
	final int kor=90; // has final value. (cannot be changed)
	
	int eng; // as no value yet, cannot declare its value "final"

	public final void print() { 
		System.out.println(kor+" "+eng);
	}
	// final method ¡æ overriding not available.
	
	
	final static int mat=99;
	// has final value, and can be called without °´Ã¼.

}

class son extends Final {

	// public void print() {}
	// cannot override print() ¡ñ print() is a final method.
	
}
