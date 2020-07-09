package chap3_search;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��Ҽ� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[num];
		
		System.out.println("������������ ���� �Է��ϼ���.");
		
		System.out.print("1��° �� :");
		arr[0] = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<arr.length; i++) {
			System.out.print((i+1)+"��° �� :");
			arr[i] = Integer.parseInt(sc.nextLine());
			
			while(arr[i]<arr[i-1]) {
				System.out.println("���� ������ ũ�ų� ���� ���� �Է��ϼ���.");
				System.out.print((i+1)+"��° �� : ");
				arr[i] = Integer.parseInt(sc.nextLine());
			}
		}
		
		System.out.println("�˻��� �� : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int result = Arrays.binarySearch(arr, key);
		
		if(result<0) {
			System.out.println("ã�� ���� �迭�� �����ϴ�.");
			System.out.println("insert point : "+(-1-result));
		} else {
			System.out.println(key+"�� "+(result+1)+"��°�� �ֽ��ϴ�.");
		}
		
		sc.close();
	}

}
