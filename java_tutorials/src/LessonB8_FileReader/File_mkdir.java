package LessonB8_FileReader;

import java.io.File;

public class File_mkdir {

	public static void main(String[] args) {
		
		// * ���丮 ���� �޼ҵ�
		File file = new File("d:/youjin");
		file.mkdir(); // youjin ���� ����
		
		// * ���� ���� �޼ҵ�
		File file2 = new File("d:/a.jpg");
		
		if(file2.exists()) {
			file2.delete(); // �ش� ����� ���� ����
			System.out.println("�����Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
		
		// * ���� ��ȯ �޼ҵ�
		File file3 = new File("d:/test.zip");
		File file4 = new File("d:/renameTotest.txt");
		file3.renameTo(file4); // file3 �� file4 ���ϸ�� Ȯ���� ����
	}

}
