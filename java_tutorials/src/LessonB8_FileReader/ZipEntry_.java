package LessonB8_FileReader;

// �������� (zip) ���� Ǯ��
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipEntry_ {

	public static void main(String[] args) throws Exception {

		// * ���� ����
		FileInputStream fis = new FileInputStream("d:/test.zip");
		
		// * �������� ���� ���� => ��ü zis
		ZipInputStream zis = new ZipInputStream(fis);

		// * �������Ͽ� ���Ե� �� ���ϵ��� ���� => ��ü zipEntry
		ZipEntry zipEntry = null;

		while ((zipEntry = zis.getNextEntry()) != null) {
			
			// * getName() : ���� �� ���ϸ� ȣ��
			// test ������ ���� ���� ������ ���ϸ����� �� ���� �����ϵ��� ����
			FileOutputStream fos = new FileOutputStream("d:/test/" + zipEntry.getName());
			
			// * test.zip ���� Ǯ�� �迭�� �о����
			int t;
			byte zip[] = new byte[200];

			// * �� ���Ͽ� ���� while��(���� Ǯ�� ���� ����)
			while ((t = zis.read(zip)) != -1) {

				fos.write(zip); // �迭 zip[]�� ����� �������� ��� (������ ������ ���ϸ� ����)
			}
			
			// * ���� �ٸ� ���� �о���⸦ ���� close
			zis.closeEntry();
			fos.close();

		}
		
		zis.close();
		fis.close();

	}

}
