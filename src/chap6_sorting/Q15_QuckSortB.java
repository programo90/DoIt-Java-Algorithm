package chap6_sorting;

import java.util.Scanner;

import chap4_stack_queue.IntStack;

public class Q15_QuckSortB {
	static void swap(int[] a, int idx1,int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static int sort3Elem(int[] x, int a, int b, int c) {
		if(x[a]>x[b])
			swap(x,a,b);
		if(x[c]<x[b])
			swap(x,b,c);
		if(x[a]>x[b])
			swap(x,a,b);
		return b;
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
			IntStack lstack = new IntStack(right-left+1);
			IntStack rstack = new IntStack(right-left+1);
			
			lstack.push(left);
			rstack.push(right);
			
			while(lstack.isEmpty() != true) {
			
				int pl = left = lstack.pop();
				int pr = right = rstack.pop();
				if(right-left <9) {
					insertionSort(a, left, right);
				} else {
					int m = sort3Elem(a, pl, (pl+pr)/2, pr);
					int x = a[m];
					swap(a,m,right);
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
						lstack.push(left);
						rstack.push(pr);
					}
					if(right>pl) {
						lstack.push(pl);
						rstack.push(right);
					}
				}
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
