package test_array;

public class Array1 {

	public static void main(String[] args) {
		// ������ ũ�� 5�� test �迭�� ����ÿ�.
		
		int[] test= new int[5];
		
		// �迭 ������� 1 ~ 5������ �� �Է��Ͻÿ�.
		

		
		for(int i=0; i<test.length; i++)
			test[i]=i+1;
		
		
		// �迭 ���� ������� ����Ͻÿ�.
		
		for (int i=0; i<test.length; i++)
			System.out.println(test[i]);
		
		
		//arr �̸��� ������ �迭 ũ��� 5
		
		int arr[] =new int[5];
		
		// 1~5 ���� ������ �Է�
		
		/*
		for(int i=0; i<arr.length; i++)
		   arr[i]=5-i;
		*/
		
		for(int i=arr.length-1; i>=0; i--)
			arr[i]=5-i;
		
		
		// ���
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		

	}

}
