package chap5_recul;

import java.util.Scanner;

public class Hanoi {

	static String[] name = {"기둥A","기둥B","기둥C"};
	static void move(int no, int x, int y) {
		if(no>1) {
			move(no-1, x, 6-x-y);
		}
		System.out.println(no+"번 원판을 "+name[x] + "에서 " + name[y] + "(으)로 이동.");
		if(no>1) {
			move(no-1,6-x-y,y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("하노이타 링의 갯수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		move(num,1,3);
		
		sc.close();
	}

}
