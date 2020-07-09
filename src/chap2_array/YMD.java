package chap2_array;

public class YMD {
	
	static int[][] mday = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
			,{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	private int year;
	private int month;
	private int day;
	
	public YMD() {}
	
	public YMD(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	static int isLeafYear(int year1) {
		return ((year1%4==0 && year1%100!=0) || year1%400==0) ? 1 : 0;
	}
	
	static int dayOfYear(int year1, int month1, int day1) {
		int d = day1;
		int m = --month1;
		int temp = isLeafYear(year1);
		while(m>0) {
			d+=mday[temp][--m];
		}
		return d;
	}
	
	YMD after(int n) {
		YMD temp = new YMD(year,month,day);
		
		temp.day += n;
		
		while(temp.day>mday[isLeafYear(temp.year)][temp.month-1]) {
			temp.day -= mday[isLeafYear(temp.year)][temp.month-1];
			if(++temp.month>12) {
				temp.year++;
				temp.month = 1;
			}
		}

		return temp;
		
		/*int tempday = dayOfYear(year,month,day)+n;
		int tempyear = year;

		while(tempday>365) {
			if(isLeafYear(tempyear)==1) {
				if(tempday!=366) {
					tempyear++;
					tempday -= 366;
				} else {
					break;
				}
			} else {
				tempyear++;
				tempday -=365;
			}
		}
		
		int tempmonth =0;
		
		while(tempday>mday[isLeafYear(tempyear)][tempmonth]) {
			tempday -= mday[isLeafYear(tempyear)][tempmonth];
			tempmonth++;
		}
		tempmonth++;
		
		return new YMD(tempyear, tempmonth, tempday);*/
	}
	
	YMD before(int n) {
		
		YMD temp = new YMD(year,month,day);
		
		temp.day -= n;
		
		while(temp.day<1) {
			if(--temp.month<1) {
				temp.year--;
				temp.month=12;
			}
			temp.day += mday[isLeafYear(temp.year)][temp.month-1];
		}
		
		return temp;
		
		
		/*int tempday = dayOfYear(year,month,day)-n;
		int tempyear = year;

		while(tempday<1) {	
			tempyear--;
			if(isLeafYear(tempyear)==1) {
				tempday +=366;
			} else {
				tempday +=365;
			}
		}
		
		int tempmonth =0;
		while(tempday>mday[isLeafYear(tempyear)][tempmonth]) {
			tempday -= mday[isLeafYear(tempyear)][tempmonth];
			tempmonth++;
		}
		
		tempmonth++;
		
		return new YMD(tempyear, tempmonth, tempday);*/
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
}
