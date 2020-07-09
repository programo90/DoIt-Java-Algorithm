package chap2_array;

import java.util.Scanner;

public class Q2_ReverseArray {

	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	static void reverseArr(int[] arr) {
		for(int i =0; i<arr.length/2; i++) {
			System.out.println("arr["+i+"]과(와) arr["+(arr.length-i-1+"] 의 값을 교환합니다"));
			swap(arr, i, arr.length-i-1);
			for(int j =0; j<arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		System.out.println("역순 정렬 완료");
	}
	
	static int sumOf(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert length : ");
		int leng = Integer.parseInt(sc.nextLine());
		
		int[] array = new int[leng];
		
		for(int i = 0; i<array.length; i++) {
			array[i] = (int)((Math.random()-1.0/2)*200);
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		reverseArr(array);
		System.out.println("총 합 : " + sumOf(array));
		
		
		sc.close();
	}

}
