package LessonA8_SortingAlgorithms;

public class SelectionSort4 {

	public static void main(String[] args) {
		
		// * �ε��� ��ȣ�� ���� ���� ���� ���� �������� ���α׷��� �Ͻÿ�.
		
		int aa[] = new int[20];
		int x;
		
		for(int i=0; i<aa.length; i++)
			aa[i]=(int)(Math.random()*45)+1;
		
		// ���� �˰���
		for(int j=0; j<aa.length-1; j++) {
			
			for(int i=j+1; i<aa.length; i++) {
				if(aa[j]>aa[i]) {
					x = aa[j];
					aa[j] = aa[i];
					aa[i] = x;
				}				
			}
			
		}
		
		for(int i=0; i<aa.length; i++)
			System.out.print(aa[i]+" ");
		
		
		

	}
}
