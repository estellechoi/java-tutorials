package LessonB8_FileReader;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedOutput {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "�ȳ�";
		
		// * ����Ʈ ������ �Է��ϱ�
		// * ���ڿ� �� byte �迭 ��ȯ
		bos.write(str.getBytes());
		
		bos.close();
		fos.close();

	}
}
