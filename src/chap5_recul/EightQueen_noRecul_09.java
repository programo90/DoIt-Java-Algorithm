package chap5_recul;

public class EightQueen_noRecul_09 {
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];
	static int[] pos = new int[8];

	static void print() {
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
		int j;
		int[] jstk = new int[8];
		loop1 :
			while(true) {
				j=0;
				while(true) {
					while(j<8) {
						if(!flag_a[j] && !flag_b[i+j] && !flag_c[i-j+7]) {
							pos[i] = j;
							if(i==7) {
								print();
							} else {
								flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
								jstk[i++] = j;
								continue loop1;
							}
						}
						j++;
					}
					if(--i==-1) {
						return;
					}	
					j= jstk[i];
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
					j++;
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
