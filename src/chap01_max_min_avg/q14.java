package chap01_max_min_avg;

import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("���簢���� ����մϴ�.");
		System.out.println("���� ���̸� �Է��ϼ��� ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
