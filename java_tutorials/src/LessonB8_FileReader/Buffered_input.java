package LessonB8_FileReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Buffered_input {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("d:/d.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		// * 파일 읽고쓰기 클래스 4가지
		// : FileReader/FileWriter/FileInputStream

		// * 바이트 단위로 읽어오기
		byte data[] = new byte[100];

		// 배열의 크기만큼 (100byte) 값 읽어와서 data[] 배열에 저장
		bis.read(data);
		
//		for (int i = 0; i < data.length; i++) {
//		System.out.println((char) data[i]);
		// 한글 인식 안되네 ...
//	}
		
		// ○ 다른 출력 방법 ! (for문 X, 한글 인식)
		// * byte 배열을 String 클래스 생성자에 매개변수로 넣어주면 문자열로 변환됨
		String str = new String(data);
		System.out.println(str);



	}

}
