package LessonB8_FileReader;
import java.io.*;

public class BufferedReader_BufferedWriter {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/c.txt"); // ���ڴ��� ?
		FileWriter fw = new FileWriter("d:/d.txt");
		
		// * ������Ʈ�� BufferedReader/BufferedWriter : ���� ������ �а� �� �� ������������ ���
		// * �ܵ���� �Ұ� ! (read ����� ������, ���Ͽ� ������ �� ����)
		// * Buffered ����ϴ� ���� ? �ѹ��ھ� �о���� �ʰ� ���ڿ��� �ٹٲޱ��� ��� �о��
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// BufferedReader.read(); �� int
		// BufferedReader.readLine(); �� String
		
		
		// * �о����
		int t;

		// 1 ���ھ� 100�� ��ҷ� �� �迭 ����
		char input[] = new char[100];

		// ���� ������ ���� ������ ���ڿ� ��ü���� ����
		String inputStr = "";

		while ((t = br.read(input)) != -1) {
			// t�� ���� -1 �� �ƴ� ��� �ݺ�
			// �迭�� 0���� t���� �ƽ�Ű�ڵ� ���� ���ڿ��� ��ȯ
			inputStr = inputStr + new String(input, 0, t);
		}
		
		// * �ۼ��ϱ�
		bw.write(inputStr);
		
		// * Buffered ��ü�� ���� close !
		br.close();
		bw.close();
		fr.close();
		fw.close();

	}

}
