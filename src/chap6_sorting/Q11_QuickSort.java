package chap6_sorting;

import java.util.Scanner;

import chap4_stack_queue.IntStack;

public class Q11_QuickSort {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2] ;
		a[idx2] = temp;
	}
	
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right- left +1);
		IntStack rstack = new IntStack(right - left +1);
		
		System.out.println("Stack push");
		lstack.push(left);
		rstack.push(right);
		System.out.println(left+" "+right);
		
		while(lstack.isEmpty() != true) {
			System.out.println("Stack state");
			for(int i = 0; i<lstack.size();i++) {
				System.out.println(lstack.peek()+" "+rstack.peek());
			}
			
			System.out.println("Stack pop");
			System.out.println(lstack.peek()+" "+rstack.peek());
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left+right)/2];
			
			System.out.println("Stack state");
			for(int i = 0; i<lstack.size();i++) {
				System.out.println(lstack.peek()+" "+rstack.peek());
			}
			
			do {
				while(a[pl]<x) pl++;
				while(a[pr]>x) pr--; 
				if(pl<=pr) {
					swap(a,pl++,pr--);
				}
				
			} while(pl <= pr);
			
			if(pr>left) {
				System.out.println("Stack push");
				System.out.println(left+" "+pr);
				lstack.push(left);
				rstack.push(pr);
			}
			
			if(right>pl) {
				System.out.println("Stack push");
				System.out.println(pl+" "+right);
				lstack.push(pl);
				rstack.push(right);
			}
			
		}// while lstack isnt empty end
		
	}
	
	static void quickSort(int[] a, int num) {
		quickSort(a, 0, num-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		quickSort(x,num);
		
		System.out.println("������ �Ϸ�");
		for(int i =0; i<num; i++) {
			System.out.print(x[i]+" ");
		}
		
		sc.close();
	}

}
