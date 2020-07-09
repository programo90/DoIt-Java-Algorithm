package chap3_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return "name : " + name + ", height : " + height + ", vision : " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData data1, PhyscData data2) {
				return (data1.height>data2.height) ? 1 : (data1.height<data2.height) ? -1 : 0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] arr = {
				new PhyscData("kim", 180, 1.0)
				,new PhyscData("lee", 175, 1.2)
				,new PhyscData("park", 170, 0.8)
				,new PhyscData("kang", 185, 0.6)
				,new PhyscData("jeong", 172, 0.4)
				
		};
		
		System.out.println("찾는 키는? : ");
		int height = Integer.parseInt(sc.nextLine());
		int result = Arrays.binarySearch(arr, new PhyscData("",height,0.0), PhyscData.HEIGHT_ORDER);
		
		if(result<0) {
			System.out.println("찾는 대상이 없습니다.");
		} else {
			System.out.println("대상은 "+(result+1)+"번째에 있습니다.");
			System.out.println(arr[result]);
		}
		
		sc.close();
	}

}
