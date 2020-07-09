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

	//좌측 아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//좌측 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//우측 아래가 직각인 이등변 삼각형
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
	
	//우측 위가 직각인 이등변 삼각형
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
