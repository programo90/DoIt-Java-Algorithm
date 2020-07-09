package chap5_recul;

import java.util.Scanner;

public class Hanoi_05_06 {
 
	static void move(int n, int x, int y) {
		int[] xstack = new int[100];
		int[] ystack = new int[100];
		int[] stack = new int[100];
		int ptr = 0;
		int sw = 0;
		
		while(true) {
			if(sw==0&&n>1) {
				xstack[ptr] = x;
				ystack[ptr] = y;
				stack[ptr] = sw;
				ptr++;
				n = n-1;
				y = 6-x-y;
				continue;
			}
			System.out.printf("[%d]¸¦ %d±âµÕ¿¡¼­ %d±âµÕÀ¸·Î ÀÌµ¿\n",n,x,y);
			if(sw==1&&n>1) {
				xstack[ptr] = x;
				ystack[ptr] = y;
				stack[ptr] = sw;
				ptr++;
				n = n-1;
				x = 6-x-y;
				if(++sw==2) {
					sw=0;
				}
				continue;
			} // if
			
			do {
				if(ptr--==0) {
					return;
				}
				x = xstack[ptr];
				y = ystack[ptr];
				sw = stack[ptr]+1;
				n++;
			} while(sw==2);
		}//while
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿ø¹ÝÀÇ °¹¼ö : ");
		int num = Integer.parseInt(sc.nextLine());
		
		move(num,1,3);
		
		sc.close();
	}

}
