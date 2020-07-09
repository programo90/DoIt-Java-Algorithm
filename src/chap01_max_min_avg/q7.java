package chap01_max_min_avg;

import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		
		System.out.print("insert num : ");
		
		int n = Integer.parseInt(sc.nextLine());
		
		while(i<=n) {
			if(i==1) {
				System.out.print(i);
			} else {
				System.out.print("+"+i);
			}
			sum += i;
			i++;			
		}
		System.out.print("="+sum);
	}
}
