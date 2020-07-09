package chap3_search;

import java.util.Scanner;

public class Q5_binSearchX {

	static int binSearchX(int[] arr, int num, int key) {
		int pl = 0;
		int pr = num-1;
		int pc;
		
		while(pl<=pr) {
			pc = (pl+pr)/2;
			if(arr[pc]==key) {
				while(arr[pc]==arr[--pc]) {
				}
				return pc+1;
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
		
		System.out.println("�迭�� ���� : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num];
		
		System.out.print("1��° �� : ");
		arr[0] = Integer.parseInt(sc.nextLine());
		for(int i=1; i<num; i++) {
			System.out.print((i+1)+"��° �� : ");
			arr[i] = Integer.parseInt(sc.nextLine());
			while(arr[i]<arr[i-1]) {
				System.out.println("���� ������ ũ�ų� ���ƾ� �մϴ�. �ٽ��Է��ϼ���.");
				System.out.print((i+1)+"��° �� : ");
				arr[i] = Integer.parseInt(sc.nextLine());
			}
		}
		
		System.out.println("�˻��� �� : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int result = binSearchX(arr, num, key);
		if(result==-1) {
			System.out.println("�迭�� ã�� ���� �����ϴ�.");
		} else {
			System.out.println(key+" �� ���� �տ� �ִ� ��ġ�� "+"x[" +result+"]�� �ֽ��ϴ�.");
		}
		
		sc.close();
		
	}

}
