package chap01_max_min_avg;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert num : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int result = 0;
		do {
			num = num/10;
			result++;
		} while(num>0);
		
		System.out.println("입력한 수는 "+ (result) +"자리의 수 입니다.");
		sc.close();

	}

}
