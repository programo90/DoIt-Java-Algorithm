package chap6_sorting;

import java.util.Scanner;

public class QuickSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x= a[(pr+pl)/2];
		
		System.out.printf("x[%d]~x[%d] : {",left,right);
		for(int i = left; i<right; i++) {
			System.out.printf("%d, ",a[i]);
		}
		System.out.printf("%d}\n",a[right]);
		
		
		do {
			while(x>a[pl]) pl++;
			while(x<a[pr]) pr--;
			if(pl<=pr) {
				swap(a, pl++, pr--);
			}
		} while(pl<=pr);
		
		if(left<pr) quickSort(a,left, pr);
		if(right>pl) quickSort(a,pl,right);
		
			
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
		
		quickSort(x, 0, num-1);
		
		System.out.println("ÄüÁ¤·Ä ¿Ï·á");
		for(int i =0; i<num; i++) {
			System.out.print(x[i]+" ");
		}
		
		sc.close();
	}

}
