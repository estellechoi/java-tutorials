package LessonB8_FileReader;
import java.io.*;

public class Buffered_image {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/Tulips.jpg");
		FileWriter fw = new FileWriter("d:/1.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// * 읽어는 오지만, 원래 그림파일의 배열 형태가 아니기 때문에 파일 깨짐 발생 !
		// * 그림파일은 바이트 단위로 읽어와야 함 ! (FileReader는 문자 단위)
		
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
		
		br.close();
		bw.close();
		fr.close();
		fw.close();

	}

}
