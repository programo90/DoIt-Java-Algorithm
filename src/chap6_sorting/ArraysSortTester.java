package chap6_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x= new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		Arrays.sort(x);
		
		System.out.println("정렬 완료");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
		
		sc.close();
	}

}
