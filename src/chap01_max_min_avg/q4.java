package chap01_max_min_avg;

import java.util.Scanner;

public class q4 {

	static int mid1(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			} else {
				if(c>=a) {
					return a;
				} else {
					return c;
				}
			}
		} else {
			if(a>=c) {
				return a;
			} else {
				if(b>=c) {
					return c;
				} else {
					return b;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println(a + "," + b + "," + c + " mid = " + mid1(a,b,c));
		
	}

}
