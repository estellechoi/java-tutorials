package Lesson2_Class_main;

public class class4a {

	// 23. pkc라는 정수형이고 크기가 10인 배열을 만들고
    // Math.random()을 이용하여 101~110까지의 임의의 수를 넣고 출력 하시오.
	
	int pkc[] = new int[10];                             // ⓐ 속성 만들기
	
	public void random() {                               // ⓑ 함수 만들기 random();
		for(int i=0; i<pkc.length; i++) {
			pkc[i] = (int)(Math.random()*10)+101;
			
			for(int j=0; j<=i-1; j++) {
			if(pkc[j]==pkc[i])
				i=i-1;
			}
		}
	}
	
	public void print() {                               // ⓒ 함수 또 만들기 print();
		
		for(int i=0; i<pkc.length; i++) {
			System.out.print(pkc[i]+" ");
		}
		
	}

}
