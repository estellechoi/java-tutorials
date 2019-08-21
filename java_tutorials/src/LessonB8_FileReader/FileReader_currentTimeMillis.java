// read() �Լ��� �̿��Ͽ� �迭�� ũ�⸸ŭ ���� ���� �о����
package LessonB8_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_currentTimeMillis {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:/APM_Setup/htdocs/helloworld/anote/git.html");
		int t;

		// 1970�� 1�� 1�� ~ ���ݱ��� �ʴ��� �ð�
		long start = System.currentTimeMillis();

		// 1 ���ھ� 100�� ��ҷ� �� �迭 ����
		char input[] = new char[100];

		// ���� ������ ���� ������ ���ڿ� ��ü���� ����
		String inputStr = "";

		// * FileReader.read(); 1�� ������ �ƽ�Ű�ڵ� ��
		while ((t = fr.read(input)) != -1) {
			// t�� ���� -1 �� �ƴ� ��� �ݺ�
			// �迭�� 0���� t���� �ƽ�Ű�ڵ� ���� ���ڿ��� ��ȯ
			inputStr = inputStr + new String(input, 0, t);
		}

		long end = System.currentTimeMillis();
		System.out.println("���� �ð� : " + (end - start));

//		// ������ 1 ���ھ� �о���� �ڵ�
//		while((t=fr.read()) != -1) {
//		}

		fr.close();
	}

}
