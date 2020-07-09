package chap2_array;

import java.util.Scanner;

public class Q8_Q9_DayOfYear {

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
		month --;
		while(month>0) {
			month--;
			day += mdays[isLeafYear(year)][month];
		}
		
		return day;
	}
	
	//�� ���� ���� ��
	static int leftDayOfYear(int year, int month, int day) {
		day = mdays[isLeafYear(year)][month-1]-day;
		while(month<12) {
			day += mdays[isLeafYear(year)][month];
			month++;
		}
		return day;
	}
	
	static boolean insertCheck(int year, int month, int day) {
		return mdays[isLeafYear(year)][month-1]>=day;
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
			
			if(insertCheck(year, month, day)) {
				System.out.println(year + "�⵵�� " + dayOfYear(year,month,day)+"��° ���Դϴ�.");
				System.out.println(year + "�⵵�� ���� �ϼ��� : " + leftDayOfYear(year, month, day)+"�Դϴ�.");
				System.out.println("1.�ٽ��ϱ�  2.����");
				retry = Integer.parseInt(sc.nextLine());
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			}
			
		}
		
		System.out.println("����˴ϴ�.");
		
		sc.close();
	}


}
