package LessonB8_FileReader;
import java.io.*;
import java.util.Scanner;

public class FileWriter_ {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("d:/a.txt");
		FileWriter fw2 = new FileWriter("d:/b.txt");
		
		// * write(); ������ ���� ������ �����ǰ� ���ο� ������ �ۼ���
		// * ���� ���� �������� ���� �߰��ϰ� ���� �� FileWriter("file", true);
		FileWriter fw3 = new FileWriter("d:/c.txt", true);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
				
		fw2.write(str);
		fw3.write(str);
		
		fw.close(); // ??
		fw2.close();
		fw3.close();

	}

}
