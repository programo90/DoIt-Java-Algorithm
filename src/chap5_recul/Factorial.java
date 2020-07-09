package chap5_recul;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 계산할 값 : ");
		int num = Integer.parseInt(sc.nextLine());
		int result = 1;
		for(int i =num; i>0; i--) {
			result *= i;
		}
		System.out.println(num+"팩토리얼은 : "+result);
		
		
		sc.close();
	}

}
