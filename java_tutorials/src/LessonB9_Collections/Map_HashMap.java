// * HashMap : key�� value�� ���� �ϳ��� entry�� ����, hashing�� ����ϱ� ������ ���� ���� �����͸� �˻��ϴµ� �پ ����
// - key �� �ߺ� �Ұ�, value �ߺ� ����, value�� null �� ��� ����

package LessonB9_Collections;

import java.util.HashMap;

import java.util.Map;

public class Map_HashMap {

	public static void main(String[] args) {

		// * key�� ������ �ҷ����� (���� key)
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "����");
		hm.put(2, "���");
		hm.put(3, "����");
		hm.put(4, "����");
		hm.put(5, "����");
		hm.put(6, "����");
		hm.put(7, "����");
		
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		// * �̹� �����Ͱ� �����ϴ� key�� �ٸ� �����͸� �߰��ϴ� ���
		//   ���� �����ʹ� �����ǰ� �� �����Ͱ� key ������ �߰���
		hm.put(7, "����");
		System.out.println(hm);
		
		// * key �ߺ����� ���� ������ �ս��� �����ϱ� (key �� ���翩�� üũ �޼ҵ�)
		System.out.println(hm.containsKey(7)); // true
		System.out.println(hm.containsKey(8)); // false
		
		// * key�� ������ �ҷ����� (���ڿ� key)
		
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
