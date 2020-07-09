package chap8_stringsearch;

import java.util.Scanner;

public class Q2_BFmatch {
	static int bfMatch(String txt, String pat) {
		int pt = txt.length()-pat.length();
		int pp = 0;
		
		while(pt>=0&&pp!=pat.length()) {
			if(txt.charAt(pt)==pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt-pp-1;
				pp = 0;
			}
		}
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
			System.out.println("�ش� ������ "+(idx+1)+"��° ���ڿ� ���� �����մϴ�.");
		}
		
		sc.close();
	}

}
