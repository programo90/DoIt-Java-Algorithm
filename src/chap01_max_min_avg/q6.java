package chap01_max_min_avg;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		
		System.out.print("insert num : ");
		
		int n = Integer.parseInt(sc.nextLine());
		
		
		while(i<=n) {
			sum += i;
			i++;			
		}
		
		System.out.println(i);
		System.out.println(sum);

	}

}
