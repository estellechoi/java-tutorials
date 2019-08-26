package LessonB8_FileReader;

// 파일을 바이트 배열로(byte[]) 읽어오기 / new FileInputStream
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {

	public static void main(String[] args) throws IOException {

		// 읽어올 파일 객체
		// new FileInputStream은 File 객체를 생성자 인수로 받을 수 있다.
		FileInputStream fis = new FileInputStream(new File("d:/a.txt"));

		// 파일 내용을 저장할 문자열
		String str = "";

		// 파일 내용을 읽어올 바이트 배열
		byte input[] = new byte[1000];

		// * read(); 1 개 문자를 읽어오며 아스키코드 값(10진수) 리턴 (ex) < → 60
		// * read(byte[]); 배열의 크기 리턴
		
		// * 읽어올 내용이 없으면 t = -1 리턴
		// int t = fis.read();
		// System.out.println((char)t);
		
		int t;
		
		while((t = fis.read(input)) != -1) {
			str = str + new String(input, 0, t);
		}
		
		System.out.println(str);

	}

}
