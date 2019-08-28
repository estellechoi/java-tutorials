package LessonB9_Collections;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Map_HashMap_random {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();

		// * 10 개의 랜덤한 key 와 key 값 추가하기
		Scanner sc = new Scanner(System.in);
		String data;
		int num;

		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 100) + 1;
			data = sc.next();
			
			// * key 중복 방지하기
			if (hm.containsKey(num)) {
				i = i - 1; // 해당 턴 재실행
			} else {
				hm.put(num, data); // key/값 추가하고 다음 턴으로
			}
		}

		// * key 중복 방지를 하지 않았다면 10개의 데이터가 출력되지 않을 수 있다
		//   중복된 key가 발생해서 먼저 추가된 데이터가 삭제되었기 때문 !
		System.out.println(hm);

	}

}
