package chap6_sorting;

import java.util.Scanner;

public class FSort {
	static void fSort(int[] a, int n, int max) {
		int[] f = new int[max+1];
		int[] b = new int[n];
		
		for(int i = 0; i<n; i++) f[a[i]]++;
		for(int i=1; i<=max; i++) f[i] += f[i-1];
		for(int i=n-1; i>=0; i--) b[--f[a[i]]] = a[i];
		for(int i=0; i<n; i++) a[i] = b[i];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도수정렬");
		System.out.println("요솟수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		for(int i =0;i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = Integer.parseInt(sc.nextLine());
			}while(x[i]<0);
		}
		
		int max = x[0];
		for(int i=1; i<num; i++) {
			if(max<x[i]) max = x[i];
		}
		
		fSort(x,num,max);
		System.out.println("오름차순 도수 정렬 완료");
		
		sc.close();
	}

}
