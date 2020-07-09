package chap6_sorting;

import java.util.Scanner;

public class Q10_QuickSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSort(int[] a, int n) {
		for(int i =1; i<=a.length/n; i++) {
			int pl= i*n - n;
			int pr = i*n-1;
			int x = a[(pr+pl)/2];
			
			do {
				while(x>a[pl]) pl++;
				while(x<a[pr]) pr--;
				if(pl<=pr) {
					swap(a, pl++, pr--);
				}
			} while(pl<=pr);
		}
		
		if((n/2)>1) {
			quickSort(a,n/2);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿ä¼Ú¼ö : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		quickSort(x, num);
		
		System.out.println("ÄüÁ¤·Ä ¿Ï·á");
		for(int i =0; i<num; i++) {
			System.out.print(x[i]+" ");
		}
		
		sc.close();
	}

}
