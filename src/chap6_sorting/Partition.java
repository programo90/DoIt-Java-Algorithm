package chap6_sorting;

import java.util.Scanner;

public class Partition {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void partition(int[] a, int n) {
		int pl =0;
		int pr = n-1;
		int x =a[n/2];
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr) {
				swap(a,pl++,pr--);
			}
		} while(pl<=pr);
		
		System.out.println("�ǹ��� �� : "+x);
		System.out.println("�ǹ� ������ �׷�");
		for(int i =0; i<=pl-1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("�ǹ��� ��ġ�ϴ� �׷�");
			for(int i=pr+1; i<=pl-1; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("�ǹ� �̻��� �׷�");
		for(int i = pr+1; i<n; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� �����ϴ�.");
		System.out.print("��ڼ� : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i =0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		partition(x,num);
		
		sc.close();
	}

}
