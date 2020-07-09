package chap3_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7_PhysExamSearch {

	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> VISION_COMPARA = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData data1, PhyscData data2) {
				return (data1.vision>data2.vision) ? 1 : (data1.vision<data2.vision) ? -1 : 0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] arr = {
				new PhyscData("kim", 180, 1.0)
				,new PhyscData("lee", 185, 1.3)
				,new PhyscData("park", 175, 1.4)
				,new PhyscData("kang", 170, 1.6)
				,new PhyscData("jeong", 173, 1.8)
		};
		
		System.out.println("찾는 사람의 시력은? : ");
		double vision = Double.parseDouble(sc.nextLine());
		int result = Arrays.binarySearch(arr, new PhyscData("",0,vision), PhyscData.VISION_COMPARA);
		
		if(result<0) {
			System.out.println("찾는 대상이 없습니다.");
		} else {
			System.out.println("시력이 " + vision +"인 사람은");
			System.out.println(arr[result]);
		}
		
		sc.close();
	}

}
