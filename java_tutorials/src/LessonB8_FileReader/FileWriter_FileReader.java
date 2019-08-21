// ���� ���� ��ü�� �����ϰ� ���ο� ������ �����ؼ� �ٿ��ֱ�

package LessonB8_FileReader;
import java.io.*;

public class FileWriter_FileReader {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/c.txt");
		FileWriter fw = new FileWriter("d:/d.txt");
		
		// * �о����
		int t;

		// 1 ���ھ� 100�� ��ҷ� �� �迭 ����
		char input[] = new char[100];

		// ���� ������ ���� ������ ���ڿ� ��ü���� ����
		String inputStr = "";

		while ((t = fr.read(input)) != -1) {
			// t�� ���� -1 �� �ƴ� ��� �ݺ�
			// �迭�� 0���� t���� �ƽ�Ű�ڵ� ���� ���ڿ��� ��ȯ
			inputStr = inputStr + new String(input, 0, t);
		}
		
		// * �ۼ��ϱ�
		fw.write(inputStr);
		
		fr.close();
		fw.close();

	}

}
