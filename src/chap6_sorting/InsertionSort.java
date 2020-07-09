package chap6_sorting;

import java.util.Scanner;

public class InsertionSort {
	static void insertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int j;
			int temp = a[i];
			for(j=i;j>0&&a[j-1]>temp;j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단순 삽입 정렬");
		System.out.print("요소수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		insertionSort(x,num);
		
		System.out.println("정렬 완료");
		for(int i = 0; i<num; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
		
		sc.close();
		
	}

}
