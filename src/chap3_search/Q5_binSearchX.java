package chap3_search;

import java.util.Scanner;

public class Q5_binSearchX {

	static int binSearchX(int[] arr, int num, int key) {
		int pl = 0;
		int pr = num-1;
		int pc;
		
		while(pl<=pr) {
			pc = (pl+pr)/2;
			if(arr[pc]==key) {
				while(arr[pc]==arr[--pc]) {
				}
				return pc+1;
			} else if(arr[pc]>key) {
				pr = pc-1;
			} else {
				pl = pc+1;
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
		
		System.out.print("1번째 값 : ");
		arr[0] = Integer.parseInt(sc.nextLine());
		for(int i=1; i<num; i++) {
			System.out.print((i+1)+"번째 값 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
			while(arr[i]<arr[i-1]) {
				System.out.println("이전 값보다 크거나 같아야 합니다. 다시입력하세요.");
				System.out.print((i+1)+"번째 값 : ");
				arr[i] = Integer.parseInt(sc.nextLine());
			}
		}
		
		System.out.println("검색할 값 : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int result = binSearchX(arr, num, key);
		if(result==-1) {
			System.out.println("배열에 찾는 값이 없습니다.");
		} else {
			System.out.println(key+" 중 가장 앞에 있는 위치는 "+"x[" +result+"]에 있습니다.");
		}
		
		sc.close();
		
	}

}
