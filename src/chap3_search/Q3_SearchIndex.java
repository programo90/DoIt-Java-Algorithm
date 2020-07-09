package chap3_search;

import java.util.Scanner;

public class Q3_SearchIndex {

	static int searchIndex(int[] arr, int num, int key, int[] idx) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				idx[count++] = i;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� ���̸� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num];
		
		for(int i =0; i<arr.length; i++) {
			System.out.print((i+1) + "��° �� : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("�˻��� ���� �Է��ϼ��� : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int[] idx = new int[num];
		int result = searchIndex(arr, num, key, idx);
		
		System.out.println("�˻��� ���� ������ "+result+"�� �Դϴ�.");
		
		sc.close();
		

	}

}
