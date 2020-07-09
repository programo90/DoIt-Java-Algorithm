package chap6_sorting;

import java.util.Scanner;

public class Q15_QuickSortA {

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
	
	static int sort3Elem(int[] x, int a, int b, int c) {
		if(x[a] > x[b])
			swap(x, a, b);
		if(x[b]>x[c])
			swap(x, b, c);
		if(x[a] > x[b])
			swap(x, a, b);
		
		return b;
		
	}
	
	static void quickSort(int[] a, int left, int right) {
		if(a.length <9) {
			insertionSort(a, left, right);
		} else {
			int pl = left;
			int pr = right;
			int m = sort3Elem(a, pl,(pl+pr/2), pr);
			int x = a[m];
			swap(a,m, right-1);
			pl++;
			pr--;
			
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
