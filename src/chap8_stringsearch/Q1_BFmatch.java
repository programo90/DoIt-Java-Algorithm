package chap8_stringsearch;

import java.util.Scanner;

public class Q1_BFmatch {
	static int bfMatch(String txt, String pat) {
		int pt = 0;
		int pp = 0;
		int ccount=0;
		while(pt!=txt.length()&&pp!=pat.length()) {
			System.out.printf("%-3d",pt);
			System.out.println(txt);
			if(txt.charAt(pt)==pat.charAt(pp)) {
				System.out.print("   ");
				for(int i=0; i<pt;i++)
					System.out.print(" ");
				System.out.println("+");
				
				System.out.print("   ");
				for(int i=0; i<pt-pp;i++)
					System.out.print(" ");
				System.out.println(pat);
				
				ccount++;
				pt++;
				pp++;
			} else {
				System.out.print("   ");
				for(int i=0; i<pt;i++)
					System.out.print(" ");
				System.out.println("|");
				
				System.out.print("   ");
				for(int i=0; i<pt-pp;i++)
					System.out.print(" ");
				System.out.println(pat);
				
				ccount++;
				pt = pt-pp+1;
				pp = 0;
			}
			
		}
		System.out.println("�� Ƚ�� : " + ccount);
		if(pp==pat.length()) return pt-pp;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("�ؽ�Ʈ : ");
		String txt = sc.nextLine();
		System.out.println("�˻� ���� : ");
		String pat = sc.nextLine();
		
		int idx = bfMatch(txt,pat);
		
		if(idx<0) {
			System.out.println("�ش� ������ �����ϴ�.");
		} else {
			System.out.println("�ش� ������ "+idx+"��° ���ڿ��� �����մϴ�.");
		}
		
		sc.close();
	}

}
