package test_array;

public class Cons2 {
	
	int kor;
	int eng;
	int mat;
	
	Cons2(int kor, int eng, int mat) {
		
		this.kor=kor; // this �� ���������� �θ��� !
		this.eng=eng;
		this.mat=mat;
		
	}
	
	public void print() {
		System.out.println(kor+eng+mat);
	}
	

}
