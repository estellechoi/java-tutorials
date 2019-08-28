// * HashMap : key와 value를 묶어 하나의 entry로 저장, hashing을 사용하기 때문에 많은 양의 데이터를 검색하는데 뛰어난 성능
// - key 값 중복 불가, value 중복 가능, value에 null 값 사용 가능

package LessonB9_Collections;

import java.util.HashMap;

import java.util.Map;

public class Map_HashMap {

	public static void main(String[] args) {

		// * key로 데이터 불러오기 (정수 key)
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "유진");
		hm.put(2, "용기");
		hm.put(3, "형우");
		hm.put(4, "동현");
		hm.put(5, "보민");
		hm.put(6, "형조");
		hm.put(7, "동석");
		
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		// * 이미 데이터가 존재하는 key에 다른 데이터를 추가하는 경우
		//   기존 데이터는 삭제되고 새 데이터가 key 값으로 추가됨
		hm.put(7, "선재");
		System.out.println(hm);
		
		// * key 중복으로 인한 데이터 손실을 방지하기 (key 값 존재여부 체크 메소드)
		System.out.println(hm.containsKey(7)); // true
		System.out.println(hm.containsKey(8)); // false
		
		// * key로 데이터 불러오기 (문자열 key)
		
		Map<String, String> hm2 = new HashMap<String, String>();
		
		hm2.put("Programmer", "Youjin");
		hm2.put("Tatooist", "Yongki");
		hm2.put("Bar Owner", "Hyungwoo");
		hm2.put("Programmer", "Donghyun");
		hm2.put("Programmer", "Bomin");
		hm2.put("Office worker", "Hyungjo");
		hm2.put("Office worker", "Dongsuk");
		
		System.out.println(hm2);
		System.out.println(hm2.get("Tatooist"));
	}

}
