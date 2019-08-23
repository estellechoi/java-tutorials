package LessonB8_FileReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInput2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("d:/d.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		// * 파일 읽고쓰기 클래스 4가지
		// : FileReader/FileWriter/FileInputStream

		// * 바이트 단위로 읽어오기
		byte data[] = new byte[100];
		
		// * 문자열로 출력하기	
		// * read(byte[]) 의 리턴값
		// 데이터 없으면 -1 리턴, 데이터 있으면 리턴값이 읽어온 크기(byte)
		
		while(bis.read(data) != -1) {
			System.out.println(new String(data)); // 배열 → 문자열로 변환
		}

	}

}
