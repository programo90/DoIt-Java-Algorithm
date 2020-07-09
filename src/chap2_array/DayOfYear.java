package chap2_array;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = { 
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
			,{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	//leaf year �Ǵ�
	static int isLeafYear(int year) {
		return ((year%4==0 && year%100!=0) || year%400==0) ? 1 : 0;
	}
	
	//�� �� ����� ��
	static int dayOfYear(int year, int month, int day) {
		int days = day;
		for(int i=0; i<month-1; i++) {
			days += mdays[isLeafYear(year)][i];
		}
		return days;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int retry = 1;
		
		while(retry==1) {
			int year, month, day;
			System.out.println("�� �ϼ��� ����� ���� �Է��ϼ���.");
			System.out.print("�⵵ : ");
			year = Integer.parseInt(sc.nextLine());
			System.out.print("�� : ");
			month = Integer.parseInt(sc.nextLine());
			System.out.print("�� : ");
			day = Integer.parseInt(sc.nextLine());
			
			
			System.out.println(year + "�⵵�� " + dayOfYear(year,month,day)+"��° ���Դϴ�.");
			
			System.out.println("1.�ٽ��ϱ�  2.����");
			retry = Integer.parseInt(sc.nextLine());
		}
		
		sc.close();
	}

}
