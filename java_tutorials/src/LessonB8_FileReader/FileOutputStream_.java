package LessonB8_FileReader;
// * 문자열을 바이트 배열로(byte[]) 변환 후 파일 작성하기 / new FileOutputStream
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {

	public static void main(String[] args) throws IOException {

		// 실행할 때마다 파일 새로 작성
		FileOutputStream fos = new FileOutputStream("d:/a.txt");

		// 실행할 때마다 작성 내용 누적
		FileOutputStream fosTrue = new FileOutputStream("d:/b.txt", true);

		// 작성할 문자열 → byte 단위로 쪼개서 입력해야 함 !
		String str = "<b>테스트문자</b>";

		// 실제 입력할 byte 배열
		byte insert[] = str.getBytes();
		
		// 작성해보자 !
		fos.write(insert);
		fosTrue.write(insert);

	}

}
