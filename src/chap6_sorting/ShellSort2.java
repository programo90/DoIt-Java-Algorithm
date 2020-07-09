package chap6_sorting;

import java.util.Scanner;

public class ShellSort2 {
	static void shellSort(int[] a, int n) {
		int h;
		for(h=1;h<n/9;h=h*3+1);
		
		for(;h>0;h/=3) {
			for(int i=h;i<n;i++) {
				int j;
				int temp = a[i];
				for(j=i-h;j>=0&&a[j]>temp;j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¼¿ Á¤·Ä2");
		System.out.print("¿ä¼Ú¼ö : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		shellSort(x,num);
		System.out.println("Á¤·Ä ¿Ï·á");
		for(int i=0; i<num;i ++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
		
		sc.close();
	}

}
