package LessonB8_FileReader;

import java.io.*;

public class StreamCopy {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("d:/d.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d:/dd.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		long start = System.currentTimeMillis();
		int i;

		while ((i = bis.read()) != -1) {
			bos.write(i);
		}

		long end = System.currentTimeMillis();
		System.out.println("소요시간(1/1000초) : " + (end - start));

		bis.close();
		bos.close();
		fis.close();
		fos.close();
	}

}
