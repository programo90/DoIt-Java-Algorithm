package chap2_array;

public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int prt = 0;
		int[] prime = new int[500];
		
		prime[prt++] = 2;
		prime[prt++] = 3;
		for(int n=5; n<=1000; n+=2 ) {
			boolean flag = false;
			for(int i=1; prime[i]*prime[i]<=n; i++) {
				count +=2;
				if(n%prime[i]==0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				count ++;
				prime[prt++] = n;
			}
		}//for
		
		for(int i =0; i<prt; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("°ö¼À or ³ª´°¼À ½ÇÇà È½¼ö : " +count);
		
	} // maing

}
