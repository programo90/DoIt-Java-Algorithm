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
		System.out.println("비교 횟수 : " + ccount);
		if(pp==pat.length()) return pt-pp;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("텍스트 : ");
		String txt = sc.nextLine();
		System.out.println("검색 패턴 : ");
		String pat = sc.nextLine();
		
		int idx = bfMatch(txt,pat);
		
		if(idx<0) {
			System.out.println("해당 패턴이 없습니다.");
		} else {
			System.out.println("해당 패턴은 "+idx+"번째 문자열에 존재합니다.");
		}
		
		sc.close();
	}

}
