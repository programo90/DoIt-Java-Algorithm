package chap2_array;

import java.util.Scanner;

public class Q6_Q7_CardConvRev {

	public static int cardConv(int x, int r, char[] d) {
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int digits = 0;
		
		System.out.println(r+"|"+x);
		System.out.println(" + ----------");
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x /=r;
			
			if(x!=0) {
				System.out.print(r+"|"+x);
				System.out.println(" ... "+d[digits-1]);
				System.out.println(" + ----------");
			} else {
				System.out.print("  "+x);
				System.out.println(" ... "+d[digits-1]);
			}
			
			
		} while(x!=0);
		
		for(int i =0; i<digits/2; i++) {
			char tempchar = d[digits-1-i];  
			d[digits-1-i] = d[i];
			d[i] = tempchar;
		}
		
		return digits;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int no;
		int cd;
		int dno;
		int retry = 0;
		char[] cno = new char[32];
		
		do {
			
			do {
				System.out.print("0�̻��� ���� �Է��ϼ��� : ");
				no = Integer.parseInt(sc.nextLine());
			} while(no<0);
			
			do {
				System.out.print("��ȯ�� ������?(2~32) : ");
				cd = Integer.parseInt(sc.nextLine());
			} while(cd<2||cd>32);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd+"������ ��ȯ�� ���� : ");
			for(int i=0; i<dno; i ++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�ٽ� �Ͻðڽ��ϰ�? 0.no , 1.yes");
			retry = Integer.parseInt(sc.nextLine());
		} while(retry!=0);
		
		System.out.println("��ȯ�� ����.");
		
		sc.close();
		
	}

}
