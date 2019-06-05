package Lesson5_methods;
// abstract class
// cannot be copied (∵ don't have methods without {})
// instead should be extended, and methods should be overridden.
public abstract class Abstract2 {
	
	int kor;
	char g; // char '' / String ""
	
	public abstract void input();
	public abstract void cal();
	public abstract void print();

}

// abstract class VS interface 비교해보자