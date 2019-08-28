package LessonB9_Collections;
// * Collections : 자료구조에 관한 Java 클래스

// * List : 순서 있음, 중복 허용 
// - Vector
// - ArrayList(배열기반) : 중간에 데이터 입력/삭제 가능하지만, 때마다 다른 데이터들이 위치 이동 → 성능 저하
// - LinkedList(연결리스트) : 중간에 데이터 입력/삭제 가능하며, 근접한 데이터와의 노드만 변경 → 성능 저하 X

// * Set : 순서 없음, 중복불가
// - HashSet : add 순서와 무관하게 자체적인 순서는 가지지만 index 없음
// - LinkedSet : 순서 있는 Set, add 순서대로 저장
// - TreeSet : sort

// * Map : index를 갖는 데이터 (1, "유진")

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_LinkedHashSet_lotto {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		Set<Integer> s3 = new TreeSet<Integer>();

		// * LinkedHashSet은 순서 있음
		while (s2.size() < 6) { // 데이터가 쌓여서 사이즈가 6이 되면 반복문 중단
			int num = (int) (Math.random() * 45) + 1;
			s2.add(num);
			System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println(s2);

	}

}
