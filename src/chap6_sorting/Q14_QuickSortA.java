package chap6_sorting;

import java.util.Scanner;

public class Q14_QuickSortA {
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) return c;
			else if(c>=a) return a;
			else return c;
		} else if(a>c) return a;
		else if(b>c) return c;
		else return b;
	}
	
	static void swap(int[] a, int idx1,int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void insertionSort(int[] a, int left, int right) {
		for(int i = left+1; i<=right; i++) {
			int temp = a[i];
			int j;
			for(j=i;j>left&&a[j-1]<temp;j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}
	
	static void quickSort(int[] a, int left, int right) {
		if(a.length <9) {
			insertionSort(a, left, right);
		} else {
			int pl = left;
			int pr = right;
			int x = med3(a[pl], a[(pl+pr)/2], a[pr]);
			
			do {
				while(a[pl]<x) pl++;
				while(a[pr]>x) pr--;
				if(pl<=pr) {
					swap(a, pl++, pr--);
				}
			} while(pl <= pr);
			if(pr-left < right-pl) {
				int temp;
				temp = left;
				left = pl;
				pl = temp;
				temp = right;
				right = pr;
				pr = temp;
			}
			
			if(left<pr) {
				quickSort(a,left,pr);
			}
			if(right>pl) {
				quickSort(a,pl,right);
			}
		}
	}
	
	static void quickSort(int[] a, int n) {
		quickSort(a, 0, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		sc.close();
	}

}
