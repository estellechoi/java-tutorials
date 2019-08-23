package LessonB8_FileReader;

// 압축파일 (zip) 압축 풀기
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipEntry_ {

	public static void main(String[] args) throws Exception {

		// * 파일 접근
		FileInputStream fis = new FileInputStream("d:/test.zip");
		
		// * 압축파일 정보 리턴 => 객체 zis
		ZipInputStream zis = new ZipInputStream(fis);

		// * 압축파일에 포함된 각 파일들을 리턴 => 객체 zipEntry
		ZipEntry zipEntry = null;

		while ((zipEntry = zis.getNextEntry()) != null) {
			
			// * getName() : 압축 전 파일명 호출
			// test 폴더에 압축 전과 동일한 파일명으로 각 파일 저장하도록 설정
			FileOutputStream fos = new FileOutputStream("d:/test/" + zipEntry.getName());
			
			// * test.zip 압축 풀고 배열로 읽어오기
			int t;
			byte zip[] = new byte[200];

			// * 각 파일에 대한 while문(압축 풀고 문서 저장)
			while ((t = zis.read(zip)) != -1) {

				fos.write(zip); // 배열 zip[]에 저장된 문서들을 출력 (지정한 폴더와 파일명에 따라)
			}
			
			// * 추후 다른 문서 읽어오기를 위해 close
			zis.closeEntry();
			fos.close();

		}
		
		zis.close();
		fis.close();

	}

}
