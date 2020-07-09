package chap6_sorting;

import java.util.Scanner;

public class Q5_BidirectionBubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void bidirectionBubbleSort(int[] a, int n) {
		int left = 0;
		int right = n-1;
		int last = right;
		
		while(left<right) {
			for(int i=right;i>left;i--) {
				if(a[i]<a[i-1]) {
					swap(a,i,i-1);
					last = i;
				}
			}
			left = last;
			
			for(int i=left;i<right;i++) {
				if(a[i]>a[i+1]) {
					swap(a,i,i+1);
					last=i;
				}
			}
			right = last;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("버블정려 1.");
		System.out.print("요소수 : ");
		int n = Integer.parseInt(sc.nextLine());
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("arr["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		bidirectionBubbleSort(x, n);
		
		System.out.println("정렬 완료");
		for(int i =0; i<n; i++) {
			System.out.printf("%3d  ",x[i]);
		}
		sc.close();

	}

}
