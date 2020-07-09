package chap4_stack_queue;

public class Q6_Gqueue<E> {
	private int max;
	private int front;
	private int rear;
	private int num;
	private E[] que;
	
	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() {}
	}
	
	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() {}
	}
	
	public Q6_Gqueue(int max) {
		this.max = max;
		num = front = rear = 0;
		
		try {
			que = (E[])new Object[max];
			
		} catch(OutOfMemoryError e) {
			max = 0;
			e.printStackTrace();
		}
	}
	
	
}
