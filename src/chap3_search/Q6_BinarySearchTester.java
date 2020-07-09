package chap3_search;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 값을 입력하세요.");
		
		System.out.print("1번째 값 :");
		arr[0] = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<arr.length; i++) {
			System.out.print((i+1)+"번째 값 :");
			arr[i] = Integer.parseInt(sc.nextLine());
			
			while(arr[i]<arr[i-1]) {
				System.out.println("이전 값보다 크거나 같은 값을 입력하세요.");
				System.out.print((i+1)+"번째 값 : ");
				arr[i] = Integer.parseInt(sc.nextLine());
			}
		}
		
		System.out.println("검색할 값 : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int result = Arrays.binarySearch(arr, key);
		
		if(result<0) {
			System.out.println("찾는 값이 배열에 없습니다.");
			System.out.println("insert point : "+(-1-result));
		} else {
			System.out.println(key+"는 "+(result+1)+"번째에 있습니다.");
		}
		
		sc.close();
	}

}
