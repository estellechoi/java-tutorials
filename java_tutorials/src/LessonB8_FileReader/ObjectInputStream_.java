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

		// ����
		FileOutputStream fos = new FileOutputStream("d:/time.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// �б�
		FileInputStream fis = new FileInputStream("d:/time.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// ���� ��¥
		Date today = new Date();
		
		// * ��ü today�� ���� time.txt�� �Է�
		oos.writeObject(today);
		
		// * 3�� �Ŀ�
		Thread.sleep(3000);

		// time.txt ������ ��ü today2�� �о����
		Date today2 = (Date) ois.readObject();
			
		// ���
		System.out.println(today.toString());
		System.out.println(today2.toString());
		
		// today, today2�� 3�� ���� �߻�
		Date today3 = new Date();
		System.out.println(today3.toString());
		

	}

}
