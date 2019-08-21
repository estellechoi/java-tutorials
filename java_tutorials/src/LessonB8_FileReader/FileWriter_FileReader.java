// 파일 내용 전체를 복사하고 새로운 파일을 생성해서 붙여넣기

package LessonB8_FileReader;
import java.io.*;

public class FileWriter_FileReader {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/c.txt");
		FileWriter fw = new FileWriter("d:/d.txt");
		
		// * 읽어오기
		int t;

		// 1 문자씩 100개 요소로 된 배열 생성
		char input[] = new char[100];

		// 파일 내용을 누적 저장할 문자열 객체변수 생성
		String inputStr = "";

		while ((t = fr.read(input)) != -1) {
			// t의 값이 -1 이 아닌 경우 반복
			// 배열의 0부터 t까지 아스키코드 값을 문자열로 변환
			inputStr = inputStr + new String(input, 0, t);
		}
		
		// * 작성하기
		fw.write(inputStr);
		
		fr.close();
		fw.close();

	}

}
