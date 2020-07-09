package chap2_array;

import java.util.Scanner;

public class Q4_Q5_ArrayEqual {

	static boolean equals(int[] arr1, int[] arr2) {
		if(arr1.length!=arr2.length) {
			return false;
		}
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	static void copy(int[] arr1, int[] arr2) {
		for(int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
	}
	
	static void rcopy(int[] arr1, int[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			arr2[arr2.length-i-1] = arr1[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert length of array : ");
		int leng = Integer.parseInt(sc.nextLine());
		int[] arr = new int[leng];
		
		for(int i =0; i<arr.length; i++) {
			System.out.print((i+1) + ":");
			int num = Integer.parseInt(sc.nextLine());
			arr[i] = num;
		}
		
		int[] arr2 = new int[leng];
		
		//copy(arr, arr2);
		rcopy(arr, arr2);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
		
		sc.close();
		
	}

}
