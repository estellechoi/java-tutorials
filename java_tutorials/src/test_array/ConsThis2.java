package test_array;

public class ConsThis2 {

	int kor;
	int eng;
	int mat;
	
	ConsThis2(int kor, int eng, int mat) {
		this.kor=kor;   // 전역변수 this.kor = 지역변수 kor;
		eng=eng;		// 여기서 eng 라고하면 지역변수이기 전역변수로 값이 안간다!
		this.mat=mat;
	}

	public void print() {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
	}

}
