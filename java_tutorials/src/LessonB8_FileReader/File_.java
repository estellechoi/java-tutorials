// * Java 에서 파일 접근하기
// File 클래스 : 기존의 파일이나 폴더를 제어를 하는 데 사용 (java.io 패키지)
// 생성자 : new File(String pathname); pathname에 해당되는 파일의 File 객체 생성
package LessonB8_FileReader;

import java.io.File;

public class File_ {

	public static void main(String[] args) {
		
		File file = new File("c:/windows"); // 디렉토리 혹은 파일 경로
		
		// * File 클래스의 메소드
		System.out.println(file.getName()); // 디렉토리 혹은 파일명 String
		System.out.println(file.getPath()); // 파일 경로 String
		System.out.println(file.lastModified()); // 최종수정일자 long	
		System.out.println(file.length()); // 파일의 길이(bytes) long
		// The return value of length() is unspecified if the pathname defines a directory.
		
		// * File 클래스 체크 메소드
		System.out.println(file.isDirectory()); // 디렉토리인가 ? boolean
		System.out.println(file.isFile()); // 파일인가 ? boolean		
		System.out.println(file.exists()); // 디렉토리 혹은 파일 존재여부 boolean
		
		// * File 클래스 권한 메소드
		System.out.println(file.canExecute()); // 파일 실행가능 여부 boolean
		System.out.println(file.canRead()); // 파일 읽기 가능 여부 boolean
		System.out.println(file.canWrite()); // 파일 쓰기 가능 여부 boolean
		

	}

}
