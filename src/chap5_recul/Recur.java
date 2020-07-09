package chap5_recul;

import java.util.Scanner;

import chap4_stack_queue.IntStack;

public class Recur {

	/*public void recur(int n) {
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public void recur(int n) {
		while(n>0) {
			recur2(n-1);
			System.out.println(n);
			n = n-2;
		}
	}*/
	
	public void recur(int n) { 
		IntStack stack = new IntStack(n);
		
		while(true) {
			if(n>0) {
				stack.push(n);
				n = n-1;
				continue;
			}
			if(stack.isEmpty()!=true) {
				n = stack.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			
			break;
		}
	}
	
	public void recur3(int n) {
		/*if(n>0) {
			recur3(n-1);
			recur3(n-2);
			System.out.println(n);
		}*/
		int[] ins1 = new int[100];
		int[] ins2 = new int[100];
		int ptr = -1;
		int sw = 0;
		
		while(true) {
			if(n>0) {
				ptr++;
				ins1[ptr] = n;
				ins2[ptr] = sw;
				
				if(sw==0) {
					n = n-1;
				} else if(sw==1) {
					n = n-2;
					sw = 0;
				}
				continue;
			}//if
			
			do {
				n= ins1[ptr];
				sw = ins2[ptr--] +1;
				
				if(sw==2) {
					System.out.println(n);
					if(ptr<0) {
						return;
					}
				}
			} while(sw==2);
		}//while
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
		
	}

}
