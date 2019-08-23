package LessonB8_FileReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInput {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("d:/d.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		// * ���� �а��� Ŭ���� 4����
		// : FileReader/FileWriter/FileInputStream

		// * ����Ʈ ������ �о����
		byte data[] = new byte[100];

		// * read(byte[]): �迭 ũ�⸸ŭ(100 byte) ���ϳ����� �о���� data �迭�� ����
		bis.read(data);
		
//		for (int i = 0; i < data.length; i++) {
//		System.out.println((char) data[i]);
		// �ѱ� �ν� �ȵǳ� ...
//	}
		
		// �� �ٸ� ��� ��� ! (for�� X, �ѱ� �ν�)
		// * byte �迭�� String Ŭ���� �����ڿ� �Ű������� �־��ָ� ���ڿ��� ��ȯ��
		String str = new String(data);
		System.out.println(str);



	}

}
