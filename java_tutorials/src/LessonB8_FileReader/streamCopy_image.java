package LessonB8_FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class streamCopy_image {

	public static void main(String[] args) throws Exception {

		// 파일 접근
		FileInputStream fis = new FileInputStream("d:/Tulips.jpg");
		FileOutputStream fos = new FileOutputStream("d:/Tulips_streamCopy.jpg");

		long start = System.currentTimeMillis(); // 시작 시간

		int i; // 읽어온 이미지 파일의 크기를 담는 변수 (데이터가 없으면 -1 리턴)
		byte img[] = new byte[1000];

		while ((i = fis.read(img)) != -1) {
			fos.write(img); // write(x); 매개변수 x의 타입 : int, byte[]
		}

		long end = System.currentTimeMillis(); // 종료 시간

		System.out.println("소요시간 : " + (end - start));
	}

}
