package LessonB8_FileReader;
import java.io.*;

public class Buffered_image {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/Tulips.jpg");
		FileWriter fw = new FileWriter("d:/1.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// * �о�� ������, ���� �׸������� �迭 ���°� �ƴϱ� ������ ���� ���� �߻� !
		// * �׸������� ����Ʈ ������ �о�;� �� ! (FileReader�� ���� ����)
		
		// * �о����
		int t;

		// 1 ���ھ� 100�� ��ҷ� �� �迭 ����
		char input[] = new char[100];

		// ���� ������ ���� ������ ���ڿ� ��ü���� ����
		String inputStr = "";

		while ((t = br.read(input)) != -1) {
			// t�� ���� -1 �� �ƴ� ��� �ݺ�
			// �迭�� 0���� t���� �ƽ�Ű�ڵ� ���� ���ڿ��� ��ȯ
			inputStr = inputStr + new String(input, 0, t);
		}
		
		// * �ۼ��ϱ�
		bw.write(inputStr);
		
		br.close();
		bw.close();
		fr.close();
		fw.close();

	}

}
