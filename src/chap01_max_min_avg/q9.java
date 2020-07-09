package chap01_max_min_avg;

import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert num1 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("insert num2 : ");
		int b = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		
		if(a>b) {
			int c=a; a=b; b=c;
		}
		
		for(; a<=b; a++) {
			sum +=a;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
