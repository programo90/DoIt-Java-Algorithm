package chap4_stack_queue;

import java.util.Scanner;

public class LastNElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int num = 10;
		int[] ary = new int[num];
		int cnt = 0;
		int retry =1;
		
		System.out.println("�������� �Է��ϼ��� : ");
		while(retry==1) {
			System.out.printf("%d��° ���� : ", cnt+1);
			ary[cnt++%num] =  Integer.parseInt(sc.nextLine());
			
			System.out.println("1.����Է�  2.����");
			retry = Integer.parseInt(sc.nextLine());
		}
		
		int i = cnt-num;
		if(i<0) {
			i=0;
		}
		
		for(;i<cnt;i++) {
			System.out.printf("%2d��° ���� �� : %d",i+1,ary[i%num]);
		}
		
		sc.close();
	}

}
