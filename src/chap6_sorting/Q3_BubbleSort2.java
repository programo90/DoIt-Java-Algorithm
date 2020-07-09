package chap6_sorting;

import java.util.Scanner;

public class Q3_BubbleSort2 {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void bubbleSort(int[] a, int n) {
		int ccount = 0;
		int excount = 0;
		for(int i=0;i<n;i++) {
			int exchg = 0;
			System.out.println("패스"+i);
			for(int j=n-1;j>i;j--) {
				for(int k=0; k<n-1; k++) {
					System.out.printf("%3d  %s",a[k],(k!=j-1)?" ":(a[j]<a[j-1])?"+":"-");
				}
				System.out.printf("%3d\n",a[n-1]);
				
				ccount++;
				if(a[j]<a[j-1]) {
					swap(a,j,j-1);
					exchg++;
					excount++;
				}
			}
			for(int j=0;j<n;j++) {
				System.out.printf("%3d   ",a[j]);
			}
			System.out.println();
			
			if(exchg==0) break;
		}
		
		System.out.println("비교횟수:"+ccount);
		System.out.println("교환횟수:"+excount);
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
		
		bubbleSort(x, n);
		
		sc.close();
	}

}
