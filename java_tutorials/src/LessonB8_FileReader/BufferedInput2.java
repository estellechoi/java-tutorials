package LessonB8_FileReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInput2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("d:/d.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		// * ���� �а��� Ŭ���� 4����
		// : FileReader/FileWriter/FileInputStream

		// * ����Ʈ ������ �о����
		byte data[] = new byte[100];
		
		// * ���ڿ��� ����ϱ�	
		// * read(byte[]) �� ���ϰ�
		// ������ ������ -1 ����, ������ ������ ���ϰ��� �о�� ũ��(byte)
		
		while(bis.read(data) != -1) {
			System.out.println(new String(data)); // �迭 �� ���ڿ��� ��ȯ
		}

	}

}
