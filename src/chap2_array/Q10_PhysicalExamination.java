package chap2_array;

import java.util.Scanner;


public class Q10_PhysicalExamination {

	//�÷��� ������ 0.1~2.1 ����
		static final int VMAX=21;
		
		static class PhyscData {
			String name;
			int height;
			double vision;
			
			PhyscData(String name, int height, double vision) {
				this.name = name;
				this.height = height;
				this.vision = vision;
			}
		}
		
		static double aveHeight(PhyscData[] data) {
			double sum = 0;
			for(PhyscData d:data) {
				sum += d.height;
			}
			return sum/data.length;
		}
		
		static void distVision(PhyscData[] data, int[] dist) {
			for(int i=0; i<data.length; i++) {
				if(data[i].vision>=0.0 && data[i].vision<=VMAX/10.0) {
					dist[(int)(data[i].vision*10)]++;
				}
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =  new Scanner(System.in);
			
			PhyscData[] data = {
					new PhyscData("park",180,1.1)
					,new PhyscData("lee", 170, 1.5)
					, new PhyscData("kim", 175, 0.8)
			};
			
			int[] vdist = new int[VMAX];
			
			System.out.println("��ü�˻� ����Ʈ");
			System.out.println("�̸�    Ű     �÷�");
			System.out.println("------------");
			for(PhyscData d:data) {
				System.out.printf("%-8s%3d%5.1f\n",d.name,d.height,d.vision);
			}
			
			System.out.println();
			System.out.printf("���Ű : %5.1f cm\n",aveHeight(data));
			System.out.println();
			
			System.out.println("�÷º���");
			distVision(data, vdist);
			for(int i=0; i<vdist.length; i++) {
				String tempStar ="";
				for(int j=0; j<vdist[i];j++) {
					tempStar += "*";
				}
				System.out.printf("%3.1f~ : ",i/10.0);
				System.out.println(tempStar);
			}
			
			sc.close();

		}
		
		

}
