package chap01_max_min_avg;

import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert number : ");
		int n = Integer.parseInt(sc.nextLine());
		//triangleLB(n);
		//triangleLU(n);
		//triangleRB(n);
		triangleRU(n);
		
		sc.close();
		
	}

	//���� �Ʒ��� ������ �̵ �ﰢ��
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//���� ���� ������ �̵ �ﰢ��
	static void triangleLU(int n) {
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//���� �Ʒ��� ������ �̵ �ﰢ��
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				if(j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	//���� ���� ������ �̵ �ﰢ��
	static void triangleRU(int n) {
		for(int i=n; i>0; i--) {
			for(int j =n; j>0; j--) {
				if(j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
