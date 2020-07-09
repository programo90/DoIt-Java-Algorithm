package chap4_stack_queue;

import java.util.Scanner;

import chap4_stack_queue.IntStack.EmptyIntStackException;
import chap4_stack_queue.IntStack.OverflowIntStackException;

public class Q1_Q2_Q3_IntStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		IntStack ins = new IntStack(64);
		
		while(true) {
			System.out.println("���� ���ÿ��� "+ins.size()+"/"+ins.capacity()+" ��ŭ�� �����Ͱ� ����Ǿ� �ֽ��ϴ�.");
			System.out.println("1.Push  2.Pop  3.Peek  4.Dump  0.End");
			int ch = Integer.parseInt(sc.nextLine());
			
			if(ch==0)
				break;
			
			switch(ch) {
			case 1  :
				System.out.print("������ �� : ");
				int tempnum = Integer.parseInt(sc.nextLine());
				
				try {
					ins.push(tempnum);
				} catch(OverflowIntStackException e) {
					e.printStackTrace();
				}
				break;
				
			case 2:
				System.out.print("���� �� : ");
				try {
					System.out.println(ins.pop());
				} catch(EmptyIntStackException e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				System.out.print("������ �� : ");
				try {
					System.out.println(ins.peek());
				} catch (EmptyIntStackException e) {
					e.printStackTrace();
				}
				break;
				
			case 4:
				ins.dump();
				break;
				
			case 5:
				ins.clear();
				break;
				
			case 6:
				System.out.print("ã�� �� : ");
				tempnum = Integer.parseInt(sc.nextLine());
				int searchindex = ins.indexOf(tempnum);
				if(searchindex<0) {
					System.out.println("�ش� ���� ���ÿ� �����ϴ�.");
				} else {
					System.out.println("�ش� ���� "+searchindex+"��°�� �ֽ��ϴ�.");
				}
				break;
				
			}
			
		}
		
		sc.close();

	}

}
