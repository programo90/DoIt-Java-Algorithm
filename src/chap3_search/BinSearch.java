package chap3_search;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int[] arr, int num, int key) {
		int pl = 0;
		int pr = num-1;
		int pc;
		while(pl<=pr) {
			pc = (pr+pl)/2;
			if(arr[pc]==key) {
				return pc;
			} else if(arr[pc]>key) {
				pr = pc-1;
			} else {
				pl = pc+1;
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
		
		System.out.println("���� ������������ �Է��ϼ���.");
		System.out.print("1��° �� : ");
		arr[0] = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<arr.length; i++) {
			System.out.print((i+1)+"��° �� : ");
			arr[i] = Integer.parseInt(sc.nextLine());
			
			while(arr[i]<arr[i-1]) {
				System.out.println("���� ���� ū ���� �Է��ϼ���.");
				System.out.print((i+1)+"��° �� : ");
				arr[i] = Integer.parseInt(sc.nextLine());
			}
		}
		
		System.out.print("�˻��� ���� �Է��ϼ��� : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int result = binSearch(arr, num, key);
		if(result==-1) {
			System.out.println("ã�� ���� �����ϴ�.");
		} else {
			System.out.println(key+ "��(��) "+ (result+1) + "��°�� �ֽ��ϴ�.");
		}
		
		sc.close();
	}

}
