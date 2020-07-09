package chap2_array;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = { 
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
			,{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	//leaf year 판단
	static int isLeafYear(int year) {
		return ((year%4==0 && year%100!=0) || year%400==0) ? 1 : 0;
	}
	
	//그 해 경과일 합
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
			System.out.println("총 일수를 계산할 날을 입력하세요.");
			System.out.print("년도 : ");
			year = Integer.parseInt(sc.nextLine());
			System.out.print("월 : ");
			month = Integer.parseInt(sc.nextLine());
			System.out.print("일 : ");
			day = Integer.parseInt(sc.nextLine());
			
			
			System.out.println(year + "년도의 " + dayOfYear(year,month,day)+"번째 날입니다.");
			
			System.out.println("1.다시하기  2.종료");
			retry = Integer.parseInt(sc.nextLine());
		}
		
		sc.close();
	}

}
