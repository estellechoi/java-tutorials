// read() 함수를 이용하여 배열의 크기만큼 파일 내용 읽어오기
package LessonB8_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_currentTimeMillis {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:/APM_Setup/htdocs/helloworld/anote/git.html");
		int t;

		// 1970년 1월 1일 ~ 지금까지 초단위 시간
		long start = System.currentTimeMillis();

		// 1 문자씩 100개 요소로 된 배열 생성
		char input[] = new char[100];

		// 파일 내용을 누적 저장할 문자열 객체변수 생성
		String inputStr = "";

		// * FileReader.read(); 1개 문자의 아스키코드 값
		while ((t = fr.read(input)) != -1) {
			// t의 값이 -1 이 아닌 경우 반복
			// 배열의 0부터 t까지 아스키코드 값을 문자열로 변환
			inputStr = inputStr + new String(input, 0, t);
		}

		long end = System.currentTimeMillis();
		System.out.println("읽은 시간 : " + (end - start));

//		// 파일을 1 문자씩 읽어오는 코드
//		while((t=fr.read()) != -1) {
//		}

		fr.close();
	}

}
