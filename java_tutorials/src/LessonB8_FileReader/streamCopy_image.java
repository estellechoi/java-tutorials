package LessonB8_FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class streamCopy_image {

	public static void main(String[] args) throws Exception {

		// ���� ����
		FileInputStream fis = new FileInputStream("d:/Tulips.jpg");
		FileOutputStream fos = new FileOutputStream("d:/Tulips_streamCopy.jpg");

		long start = System.currentTimeMillis(); // ���� �ð�

		int i; // �о�� �̹��� ������ ũ�⸦ ��� ���� (�����Ͱ� ������ -1 ����)
		byte img[] = new byte[1000];

		while ((i = fis.read(img)) != -1) {
			fos.write(img); // write(x); �Ű����� x�� Ÿ�� : int, byte[]
		}

		long end = System.currentTimeMillis(); // ���� �ð�

		System.out.println("�ҿ�ð� : " + (end - start));
	}

}
