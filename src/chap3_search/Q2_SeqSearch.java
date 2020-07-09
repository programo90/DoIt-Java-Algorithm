package chap3_search;

import java.util.Scanner;

public class Q2_SeqSearch {

	static int seqSearch(int[] arr, int num, int key) {
		System.out.print("   |");
		for(int i=0; i<num; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("---+-----------------------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("   |");
			for(int j=0; j<arr.length; j++) {
				if(j==i) {
					System.out.print(" *");
					break;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			System.out.print("  "+i+"|");
			for(int j=0; j<arr.length; j++) {
				System.out.print(" "+arr[j]);
			}
			System.out.println();
			
			if(arr[i]==key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + "번째 값 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("찾는 값 : ");
		int key = Integer.parseInt(sc.next());
		
		int result = seqSearch(arr, num, key);
		if(result==-1) {
			System.out.println("찾는 값이 배열에 없습니다.");
		} else {
			System.out.println(key+"은(는) " + "x[" + result + "]에 있습니다.");
		}
		
		sc.close();
		
	}

}
