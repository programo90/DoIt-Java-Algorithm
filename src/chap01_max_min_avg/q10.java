package chap01_max_min_avg;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int result = 0;
		
		System.out.print("insert num a : ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("insert num b : ");
		b = Integer.parseInt(sc.nextLine());
		
		while(a>=b) {
			System.out.println("a보다 큰 값을 입력하세요");
			System.out.print("insert num b : ");
			b = Integer.parseInt(sc.nextLine());
		}
		
		result = b-a;
		
		System.out.println(result);
		
		sc.close();
	}

}
