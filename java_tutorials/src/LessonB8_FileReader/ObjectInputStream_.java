package LessonB8_FileReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


public class ObjectInputStream_ {

	public static void main(String[] args) throws Exception {

		// 쓰기
		FileOutputStream fos = new FileOutputStream("d:/time.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 읽기
		FileInputStream fis = new FileInputStream("d:/time.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// 현재 날짜
		Date today = new Date();
		
		// * 객체 today를 문서 time.txt에 입력
		oos.writeObject(today);
		
		// * 3초 후에
		Thread.sleep(3000);

		// time.txt 문서를 객체 today2에 읽어오기
		Date today2 = (Date) ois.readObject();
			
		// 출력
		System.out.println(today.toString());
		System.out.println(today2.toString());
		
		// today, today2와 3초 차이 발생
		Date today3 = new Date();
		System.out.println(today3.toString());
		

	}

}
