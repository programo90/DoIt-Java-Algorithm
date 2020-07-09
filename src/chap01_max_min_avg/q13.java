package chap01_max_min_avg;

import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("  | 1  2  3  4  5  6  7  8  9 ");
		System.out.println("--+---------------------------");
		
		int re;
		for(int i=1; i<10; i++) {
			System.out.print(i+" |");
			for(int j=1; j<10; j++) {
				re = i+j;
				if(re<10) {
					System.out.print(" "+re+" ");	
				} else {
					System.out.print(" "+re);
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
