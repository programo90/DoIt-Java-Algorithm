package chap3_search;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] arr, int num, int key) {
		int i=0;
		for(; i<arr.length; i++) {
			if(arr[i]==key) {
				break;
			}
		}
		return (i==num)? -1 : i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num+1];
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.print((i+1)+"번째 값 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.print("검색할 값 : ");
		int key = Integer.parseInt(sc.nextLine());
		arr[num] = key;
		
		int result = seqSearchSen(arr,num,key);
		if(result==-1) {
			System.out.println("찾는 값이 없습니다.");
		} else {
			System.out.println(key+"은(는) "+(result+1)+"번째에 있습니다.");
		}
		
		
		
		sc.close();
	}

}
