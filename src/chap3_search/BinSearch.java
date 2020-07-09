package chap3_search;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int[] arr, int num, int key) {
		int pl = 0;
		int pr = num-1;
		int pc;
		while(pl<=pr) {
			pc = (pr+pl)/2;
			if(arr[pc]==key) {
				return pc;
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
		System.out.print("배열의 길이를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] arr = new int[num];
		
		System.out.println("값을 오름차순으로 입력하세요.");
		System.out.print("1번째 값 : ");
		arr[0] = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<arr.length; i++) {
			System.out.print((i+1)+"번째 값 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
			
			while(arr[i]<arr[i-1]) {
				System.out.println("이전 보다 큰 값을 입력하세요.");
				System.out.print((i+1)+"번째 값 : ");
				arr[i] = Integer.parseInt(sc.nextLine());
			}
		}
		
		System.out.print("검색할 값을 입력하세요 : ");
		int key = Integer.parseInt(sc.nextLine());
		
		int result = binSearch(arr, num, key);
		if(result==-1) {
			System.out.println("찾는 값이 업습니다.");
		} else {
			System.out.println(key+ "은(는) "+ (result+1) + "번째에 있습니다.");
		}
		
		sc.close();
	}

}
