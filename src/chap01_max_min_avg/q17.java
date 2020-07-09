package chap01_max_min_avg;

import java.util.Scanner;

public class q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert number : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*(i-1)+1);j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
