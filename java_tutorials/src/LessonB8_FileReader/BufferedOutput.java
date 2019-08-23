package LessonB8_FileReader;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedOutput {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "안녕";
		
		// * 바이트 단위로 입력하기
		// * 문자열 → byte 배열 변환
		bos.write(str.getBytes());
		
		bos.close();
		fos.close();

	}
}
