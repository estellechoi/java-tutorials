package LessonB7_Private;

//������(setter) ������(getter)
public class getter_setter {

	// * private �Ӽ� : �ܺ� Ŭ�������� ���ٺҰ� �Ӽ�
	private int kor;
	private int eng;
	private int mat;

	// * ������(Setter) : �ܺ� Ŭ�������� �Ӽ��� ���� �ַ��� �Ű������� �ʿ��ϴ� !
	public void setKor(int kor) {

		this.kor = kor; // this.kor �������� = kor �Ű�����(����)
	}

	// * ������(Getter) : �ܺ� Ŭ�������� �Ӽ� ���� ����Ϸ��� public method�� ����� !
	public int getKor() {
		return kor;
	}

	// * ��Ŭ���� �� setter, getter �ڵ����� ���

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}
