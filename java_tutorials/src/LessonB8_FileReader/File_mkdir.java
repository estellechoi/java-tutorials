package LessonB8_FileReader;

import java.io.File;

public class File_mkdir {

	public static void main(String[] args) {
		
		// * 디렉토리 생성 메소드
		File file = new File("d:/youjin");
		file.mkdir(); // youjin 폴더 생성
		
		// * 파일 삭제 메소드
		File file2 = new File("d:/a.jpg");
		
		if(file2.exists()) {
			file2.delete(); // 해당 경로의 파일 삭제
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("해당 파일이 존재하지 않습니다.");
		}
		
		// * 파일 변환 메소드
		File file3 = new File("d:/test.zip");
		File file4 = new File("d:/renameTotest.txt");
		file3.renameTo(file4); // file3 → file4 파일명과 확장자 변경
	}

}
