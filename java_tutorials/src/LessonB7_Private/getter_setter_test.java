package LessonB7_Private;

// setter�� ���� ��, ��, �� ������ �Է��ϰ� getter�� ���� �հ踦 ����Ͻÿ�.
public class getter_setter_test {

	private int kor;
	private int eng;
	private int mat;
	private int total;

	// * ������(Setter)

	public void setGrade(int kor, int eng, int mat) {
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
//		this.total = this.kor + this.eng + this.mat;
		total = kor + eng + mat;
	}

	
	// * ������(Getter)
	
	public int getTotal() {
		return total;
	}

}
