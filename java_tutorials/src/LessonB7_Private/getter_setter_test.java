package LessonB7_Private;

// setter를 통해 국, 영, 수 점수를 입력하고 getter를 토해 합계를 출력하시오.
public class getter_setter_test {

	private int kor;
	private int eng;
	private int mat;
	private int total;

	// * 설정자(Setter)

	public void setGrade(int kor, int eng, int mat) {
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
//		this.total = this.kor + this.eng + this.mat;
		total = kor + eng + mat;
	}

	
	// * 접근자(Getter)
	
	public int getTotal() {
		return total;
	}

}
