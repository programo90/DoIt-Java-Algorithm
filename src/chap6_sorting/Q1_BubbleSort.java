package chap6_sorting;

import java.util.Scanner;

public class Q1_BubbleSort {

	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	static void bubbleSort(int[] a, int n) {
		for(int i = n-1;i>0;i--) {
			for(int j =0; j<i;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		System.out.println("�������� 1.");
		System.out.print("��Ҽ� : ");
		int n = Integer.parseInt(sc.nextLine());
		int[] x = new int[n];

		for(int i=0; i<n; i++) {
			System.out.print("arr["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}

		bubbleSort(x, n);

		System.out.println("�������� ���� ���� �Ϸ�.");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}

		sc.close();
	}

}
