package chap2_array;

import java.util.Random;
import java.util.Scanner;

public class Q1_MaxOfArray_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int[] arr = new int[rand.nextInt(10)+1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 100+rand.nextInt(90);
			System.out.println(i+" : " + arr[i]);
		}
		
		System.out.println("max num : " + maxOf(arr));
		
		sc.close();
		
	}
	
	static int maxOf(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
