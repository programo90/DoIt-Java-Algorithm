package chap5_recul;

import java.util.Scanner;

public class Hanoi {

	static String[] name = {"���A","���B","���C"};
	static void move(int no, int x, int y) {
		if(no>1) {
			move(no-1, x, 6-x-y);
		}
		System.out.println(no+"�� ������ "+name[x] + "���� " + name[y] + "(��)�� �̵�.");
		if(no>1) {
			move(no-1,6-x-y,y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϳ���Ÿ ���� ���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		move(num,1,3);
		
		sc.close();
	}

}
