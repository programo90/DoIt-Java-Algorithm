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
			System.out.println("현재 스택에는 "+ins.size()+"/"+ins.capacity()+" 만큼의 데이터가 저장되어 있습니다.");
			System.out.println("1.Push  2.Pop  3.Peek  4.Dump  0.End");
			int ch = Integer.parseInt(sc.nextLine());
			
			if(ch==0)
				break;
			
			switch(ch) {
			case 1  :
				System.out.print("저장할 값 : ");
				int tempnum = Integer.parseInt(sc.nextLine());
				
				try {
					ins.push(tempnum);
				} catch(OverflowIntStackException e) {
					e.printStackTrace();
				}
				break;
				
			case 2:
				System.out.print("꺼낸 값 : ");
				try {
					System.out.println(ins.pop());
				} catch(EmptyIntStackException e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				System.out.print("마지막 값 : ");
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
				System.out.print("찾는 값 : ");
				tempnum = Integer.parseInt(sc.nextLine());
				int searchindex = ins.indexOf(tempnum);
				if(searchindex<0) {
					System.out.println("해당 값은 스택에 없습니다.");
				} else {
					System.out.println("해당 값은 "+searchindex+"번째에 있습니다.");
				}
				break;
				
			}
			
		}
		
		sc.close();

	}

}
