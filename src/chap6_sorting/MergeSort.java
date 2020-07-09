package chap6_sorting;

import java.util.Scanner;

public class MergeSort {
	static int[] buff;
	
	static void __mergeSort(int[] a, int left, int right) {
		if(left<right) {
			int i;
			int j = 0;
			int p = 0;
			int k = left;
			int center = (left+right)/2;
			__mergeSort(a,left, center);
			__mergeSort(a,center+1, right);
			
			for(i=left; i<=center; i++) {
				buff[p++] = a[i];
			}
			
			while(i<=right&&j<p) {
				a[k++] = (buff[j]<a[i])? buff[j++] : a[i++];
			}
			
			while(j<p) a[k++] = buff[j++];
			
			
		}
	}
	
	static void mergeSort(int[] a, int n) {
		buff = new int[n];
		__mergeSort(a, 0, n-1);
		buff = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("병합정렬");
		System.out.print("요솟수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i =0; i<num; i++) {
			System.out.print("x["+i+"] :");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		mergeSort(x, num);
		
		System.out.println("정렬 완료");
		for(int i =0; i<num; i++) {
			System.out.println("x["+i+"] : "+x[i]);
			
		}
		
		sc.close();
	}

}
