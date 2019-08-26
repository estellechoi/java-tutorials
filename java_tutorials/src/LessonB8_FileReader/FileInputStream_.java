package LessonB8_FileReader;

// ������ ����Ʈ �迭��(byte[]) �о���� / new FileInputStream
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {

	public static void main(String[] args) throws IOException {

		// �о�� ���� ��ü
		// new FileInputStream�� File ��ü�� ������ �μ��� ���� �� �ִ�.
		FileInputStream fis = new FileInputStream(new File("d:/a.txt"));

		// ���� ������ ������ ���ڿ�
		String str = "";

		// ���� ������ �о�� ����Ʈ �迭
		byte input[] = new byte[1000];

		// * read(); 1 �� ���ڸ� �о���� �ƽ�Ű�ڵ� ��(10����) ���� (ex) < �� 60
		// * read(byte[]); �迭�� ũ�� ����
		
		// * �о�� ������ ������ t = -1 ����
		// int t = fis.read();
		// System.out.println((char)t);
		
		int t;
		
		while((t = fis.read(input)) != -1) {
			str = str + new String(input, 0, t);
		}
		
		System.out.println(str);

	}

}
