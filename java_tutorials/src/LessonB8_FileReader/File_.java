// * Java ���� ���� �����ϱ�
// File Ŭ���� : ������ �����̳� ������ ��� �ϴ� �� ��� (java.io ��Ű��)
// ������ : new File(String pathname); pathname�� �ش�Ǵ� ������ File ��ü ����
package LessonB8_FileReader;

import java.io.File;

public class File_ {

	public static void main(String[] args) {
		
		File file = new File("c:/windows"); // ���丮 Ȥ�� ���� ���
		
		// * File Ŭ������ �޼ҵ�
		System.out.println(file.getName()); // ���丮 Ȥ�� ���ϸ� String
		System.out.println(file.getPath()); // ���� ��� String
		System.out.println(file.lastModified()); // ������������ long	
		System.out.println(file.length()); // ������ ����(bytes) long
		// The return value of length() is unspecified if the pathname defines a directory.
		
		// * File Ŭ���� üũ �޼ҵ�
		System.out.println(file.isDirectory()); // ���丮�ΰ� ? boolean
		System.out.println(file.isFile()); // �����ΰ� ? boolean		
		System.out.println(file.exists()); // ���丮 Ȥ�� ���� ���翩�� boolean
		
		// * File Ŭ���� ���� �޼ҵ�
		System.out.println(file.canExecute()); // ���� ���డ�� ���� boolean
		System.out.println(file.canRead()); // ���� �б� ���� ���� boolean
		System.out.println(file.canWrite()); // ���� ���� ���� ���� boolean
		

	}

}
