package chap3_search;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] arr, int num, int key) {
		int i=0;
		for(; i<arr.length; i++) {
			if(arr[i]==key) {
				break;
			}
		}
		return (i==num)? -1 : i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ���̸� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num+1];
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.print((i+1)+"��° �� : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.print("�˻��� �� : ");
		int key = Integer.parseInt(sc.nextLine());
		arr[num] = key;
		
		int result = seqSearchSen(arr,num,key);
		if(result==-1) {
			System.out.println("ã�� ���� �����ϴ�.");
		} else {
			System.out.println(key+"��(��) "+(result+1)+"��°�� �ֽ��ϴ�.");
		}
		
		
		
		sc.close();
	}

}
