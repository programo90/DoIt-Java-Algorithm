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
		
		System.out.println("�Է��� ���� "+ (result) +"�ڸ��� �� �Դϴ�.");
		sc.close();

	}

}
