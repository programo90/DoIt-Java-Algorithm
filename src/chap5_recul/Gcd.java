package chap5_recul;

import java.util.Scanner;

public class Gcd {

	static int gcd(int x, int y) {
		int temp;
		while(y!=0) {
			temp = y;
			y = x%y;
			x = temp;
		}
		return x;
	}
	
	static int gcdArray(int[] arr) {
		
		int temp = gcd(arr[0],arr[1]);
		
		for(int i=1; i<arr.length; i++) {
			temp = gcd(temp,arr[i]);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수 계산");
		System.out.println("값1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("값2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("최대공약수는 : " + gcd(num1,num2) +"입니다.");
		
		sc.close();
	}

}
