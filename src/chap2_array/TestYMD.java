package chap2_array;

public class TestYMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YMD ins = new YMD(2021,1,10);
		
		YMD ins2 = ins.after(365);
		YMD ins3 = ins.before(10);
		System.out.println("2021.1.10 ±‚¡ÿ");
		System.out.println("after 365 day : " + ins2.getYear()+"."+ins2.getMonth()+"."+ins2.getDay());
		System.out.println("before 10 day : " + ins3.getYear()+"."+ins3.getMonth()+"."+ins3.getDay());
	}

}
