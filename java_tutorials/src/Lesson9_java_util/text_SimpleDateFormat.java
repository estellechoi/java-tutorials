package Lesson9_java_util;
import java.util.Date;
import java.text.SimpleDateFormat;

public class text_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		// Date Format ��Ʈ��
		// E : ��/��/ȭ/��/��/��/��
		// a : ����/����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dayBar = sdf.format(today);
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String dayKor = sdf.format(today);
		
		sdf = new SimpleDateFormat("a HH:mm:ss");
		String time = sdf.format(today);
		
		System.out.println(dayBar);
		System.out.println(dayKor);
		System.out.println(time);
		
		sdf = new SimpleDateFormat("������ yyyy�� MM�� dd�� E�����Դϴ�.");
		String greet = sdf.format(today);
		
		System.out.println(greet);

	}

}
