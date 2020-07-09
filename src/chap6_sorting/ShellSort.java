package chap6_sorting;

import java.util.Scanner;

public class ShellSort {
	static void shellSort(int[] a,int n) {
		for(int h=n/2;h>0;h/=2) {
			for(int i=h; i<n; i++) {
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
		
		System.out.println("�� ����1");
		System.out.print("��ڼ� : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = Integer.parseInt(sc.nextLine());
		}
		
		shellSort(x,num);
		System.out.println("���� �Ϸ�");
		for(int i=0; i<num;i ++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
		
		sc.close();
		
	}

}
