package LessonB8_FileReader;

// * Stream Ŭ���� : bytes ������ �о���µ� ���
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {

	public static void main(String[] args) throws IOException {

		// ������ ������ ���� ���� �ۼ�
		FileOutputStream fos = new FileOutputStream("d:/a.txt");

		// ������ ������ �ۼ� ���� ����
		FileOutputStream fosTrue = new FileOutputStream("d:/b.txt", true);

		// �ۼ��� ���ڿ� �� byte ������ �ɰ��� �Է��ؾ� �� !
		String str = "<b>�׽�Ʈ����</b>";

		// ���� �Է��� byte �迭
		byte insert[] = str.getBytes();
		
		// �ۼ��غ��� !
		fos.write(insert);
		fosTrue.write(insert);

	}

}
