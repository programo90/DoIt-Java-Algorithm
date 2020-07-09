package chap5_recul;

public class EightQueen_08 {
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];
	static int[] pos = new int[8];
	
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d",pos[i]);
		}
		System.out.println();
	}
	
	static void print2() {
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(j==pos[i]) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j]==false && flag_b[i+j] ==false && flag_c[i-j+7]==false) {
				pos[i] = j;
				if(i==7) {
					print2();
				} else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
