package test_array;

public class Cons2 {
	
	int kor;
	int eng;
	int mat;
	
	Cons2(int kor, int eng, int mat) {
		
		this.kor=kor; // this → 전역변수를 부르자 !
		this.eng=eng;
		this.mat=mat;
		
	}
	
	public void print() {
		System.out.println(kor+eng+mat);
	}
	

}
