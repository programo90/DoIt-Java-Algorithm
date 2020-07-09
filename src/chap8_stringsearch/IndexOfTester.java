package chap8_stringsearch;

import java.util.Scanner;

public class IndexOfTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ؽ�Ʈ : ");
		String s1 = sc.nextLine();
		System.out.println("���� : ");
		String s2 = sc.nextLine();
		
		int idx1 = s1.indexOf(s2);
		int idx2 = s1.lastIndexOf(s2);
		
		if(idx1<0) {
			System.out.println("�ش� ������ �����ϴ�.");
		} else {
			int len1 = 0;
			for(int i=0;i<idx1;i++) {
				len1 += s1.substring(i,i+1).getBytes().length;
			}
			len1 +=s2.length();
			
			int len2 = 0;
			for(int i=0; i<idx2; i++) {
				len2 += s1.substring(i,i+1).getBytes().length;
			}
			len2 += s2.length();
			
			System.out.println("�ؽ�Ʈ : "+s1);
			System.out.printf(String.format("���� : %%%ds\n", len1), s2);
			System.out.println("�ؽ�Ʈ : "+s1);
			System.out.printf(String.format("���� : %%%ds\n", len2), s2);
		}
		
		sc.close();
	}

}
