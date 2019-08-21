package LessonB8_FileReader;
import java.io.*;

public class BufferedReader_BufferedWriter {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/c.txt"); // 문자단위 ?
		FileWriter fw = new FileWriter("d:/d.txt");
		
		// * 보조스트림 BufferedReader/BufferedWriter : 파일 내용을 읽고 쓸 때 보조수단으로 사용
		// * 단독사용 불가 ! (read 기능은 있으나, 파일에 접근할 수 없음)
		// * Buffered 사용하는 이유 ? 한문자씩 읽어오지 않고 문자열과 줄바꿈까지 모두 읽어옴
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// BufferedReader.read(); → int
		// BufferedReader.readLine(); → String
		
		
		// * 읽어오기
		int t;

		// 1 문자씩 100개 요소로 된 배열 생성
		char input[] = new char[100];

		// 파일 내용을 누적 저장할 문자열 객체변수 생성
		String inputStr = "";

		while ((t = br.read(input)) != -1) {
			// t의 값이 -1 이 아닌 경우 반복
			// 배열의 0부터 t까지 아스키코드 값을 문자열로 변환
			inputStr = inputStr + new String(input, 0, t);
		}
		
		// * 작성하기
		bw.write(inputStr);
		
		// * Buffered 객체를 먼저 close !
		br.close();
		bw.close();
		fr.close();
		fw.close();

	}

}
