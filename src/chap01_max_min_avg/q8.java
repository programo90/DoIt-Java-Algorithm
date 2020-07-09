package chap01_max_min_avg;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("insert num : ");
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		if(n%2!=0) {
			sum +=n;
			n--;
		}
		
		sum = sum + (1+n)*(n/2);

		System.out.println(sum);
		
		sc.close();
		
	}

}
