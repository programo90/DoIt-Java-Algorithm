package chap6_sorting;

import java.util.Scanner;

public class Q6_SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0; i<n; i++) {
			int min = i;
			for(int j=i+1;j<n; j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}//for selection pass
			
			for(int j=0; j<n; j++) {
				System.out.printf("%3c",(j==i)?'*':(j==min)?'+':' ');
			}
			System.out.println();
			for(int j=0; j<n; j++) {
				System.out.printf("%3d",a[j]);
			}
			System.out.println();
			swap(a,i,min);
		}// for
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단순 선택 정렬");
		System.out.print("요소수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		selectionSort(x,num);
		
		System.out.println("정렬 완료");
		for(int i = 0; i<num; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
		
		sc.close();
		
	}

}
