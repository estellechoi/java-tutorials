package LessonB7_Private;

//설정자(setter) 접근자(getter)
public class getter_setter {

	// * private 속성 : 외부 클래스에서 접근불가 속성
	private int kor;
	private int eng;
	private int mat;

	// * 설정자(Setter) : 외부 클래스에서 속성에 값을 주려면 매개변수가 필요하다 !
	public void setKor(int kor) {

		this.kor = kor; // this.kor 전역변수 = kor 매개변수(지역)
	}

	// * 접근자(Getter) : 외부 클래스에서 속성 값을 사용하려면 public method를 만든다 !
	public int getKor() {
		return kor;
	}

	// * 이클립스 내 setter, getter 자동생성 기능

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}
