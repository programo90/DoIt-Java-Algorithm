package chap3_search;

import java.util.Scanner;

public class SeqSearch {

	static int seqSearch(int[] arr, int num, int key) {
		
		/*
		   int i=0;
		   while(true) {
			if(i==num) {
				return -1;
			}
			if(arr[i] == key) {
				return i;
			}
			i++;
		}*/
		
		for(int i=0;i<arr.length; i++ ) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ���̸� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"��° �� : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.print("�˻��� �� : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int result = seqSearch(arr,num,key);
		if(result==-1) {
			System.out.println("ã�� ���� �����ϴ�.");
		} else {
			System.out.println(key+"��(��) "+(result+1)+"��°�� �ֽ��ϴ�.");
		}
		
		
		
		sc.close();
	}

}
