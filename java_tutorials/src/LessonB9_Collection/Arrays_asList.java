// 배열을 리스트로 변환하기 / ArrayList의 상위 인터페이스 List
// List는 ArrayList, LinkedList 클래스의 상위 인터페이스
package LessonB9_Collection;

import java.util.Arrays;
import java.util.List;

public class Arrays_asList {

	public static void main(String[] args) {
		
		// * 배열
		String name[] = new String[5];
		name[0] = "유진";
		name[1] = "보민";
		name[2] = "형우";
		name[3] = "동현";
		name[4] = "정은";
		
		// * 배열을 리스트로 변환하기
		// * Arrays 클래스 asList 메소드를 사용 // cf) Integer.parseInt(String);
		// * List는 ArrayList의 상위 인터페이스
		List<String> li = Arrays.asList(name);
		
		// * ArrayList 2번 인덱스 값 호출
		System.out.println(li.get(2));

	}

}
