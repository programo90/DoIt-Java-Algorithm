package chap6_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q16_PhyscExamSort {
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision ) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision<d2.vision) ? 1 : (d1.vision>d2.vision) ? -1 : 0;
			}
		}
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height>d2.height) ? 1 :d1.height<d2.height?-1:0;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("kim", 170, 1.0)
				,new PhyscData("lee", 165, 1.5)
				,new PhyscData("kang", 175, 0.8)
				,new PhyscData("kim2",180,1.2)
				,new PhyscData("jeong",185,0.6)
				,
		};
		
		
		/*Arrays.sort(x, PhyscData.HEIGHT_ORDER);*/
		Arrays.sort(x, PhyscData.VISION_ORDER);
		
		System.out.println("신체조건 정렬 완료");
		for(int i=0; i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		sc.close();
	}

}
