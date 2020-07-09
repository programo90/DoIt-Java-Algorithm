package chap6_sorting;

import java.util.Scanner;

public class HeapSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void downHeap(int[] a, int left, int right) {
		int t = a[left];
		int child;
		int parent;
		
		for(parent = left;parent<(right+1)/2; parent=child) {
			int cl = parent*2+1;
			int cr = cl+1;
			child = (cr<=right&&a[cr]>a[cl])?cr:cl;
			if(t >=a[child]) break;
			
			a[parent] = a[child];
		}
		a[parent] = t;
	}
	
	static void heapSort(int[] a, int n) {
		for(int i=(n-1)/2; i>=0; i--) {
			System.out.println(i);
			downHeap(a, i, n-1);
		}
		
		for(int i=n-1;i>0; i--) {
			swap(a,0,i);
			downHeap(a,0,i-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Èü Á¤·Ä");
		System.out.println("¿ä¼Ú¼ö : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		heapSort(x,num);
		
		System.out.println("¿À¸§Â÷¼ø ÈüÁ¤·Ä ¿Ï·á");
		for(int i =0; i<num; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
		
		sc.close();
	}

}
