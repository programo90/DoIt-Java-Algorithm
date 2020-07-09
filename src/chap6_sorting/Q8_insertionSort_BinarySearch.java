package chap6_sorting;

import java.util.Scanner;

public class Q8_insertionSort_BinarySearch {
	static void insertionSort(int[] a, int n) {
		for(int i =1; i<n; i++) {
			int temp = a[i];
			int lp = 0;
			int rp = i-1;
			int cp;
			int dp;
			do {
				cp = (lp+rp)/2;
				if(a[cp]==temp) {
					break;
				} else if(a[cp]<temp) {
					lp = cp+1;
				} else {
					rp = cp-1;
				}
			} while(lp<=rp);
			dp = (lp<=rp)?cp+1:rp+1;
			
			for(int j=i;j>dp;j--) {
				a[j] = a[j-1];
			}
			a[dp] = temp;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이진 삽입 정렬");
		System.out.print("요소수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		insertionSort(x,num);
		
		System.out.println("정렬 완료");
		for(int i = 0; i<num; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
		
		sc.close();
	}

}
