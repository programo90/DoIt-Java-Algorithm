package chap4_stack_queue;

public class Q4_IntAryQueue {
	private int max;
	private int num;
	private int[] que;
	
	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {}
	}
	
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {}
	}
	
	public Q4_IntAryQueue(int max) {
		this.max = max;
		num = 0;
		
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			e.printStackTrace();
		}
		
	}
	
	public int enque(int x) throws OverflowIntAryQueueException {
		if(num>=max) {
			throw new OverflowIntAryQueueException();
		}
		return que[num++] = x;
	}
	
	public int deque() throws EmptyIntAryQueueException{
		if(num<=0) {
			throw new EmptyIntAryQueueException();
		}
		
		int tempresult = que[0];
		for(int i=0; i<num-1; i++) {
			que[i] = que[i+1];
		}
		num--;
		
		return tempresult;
	}
	
	public int peek() throws EmptyIntAryQueueException {
		if(num<=0) {
			throw new EmptyIntAryQueueException();
		}
		
		return que[num-1];
	}
	
	public int indexOf(int x) {
		for(int i=num-1; i>=0; i--) {
			if(que[i]==x) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void clear() {
		num = 0;
	}
	
	public int size() {
		return num;
	}
	
	public int capacity() {
		return max;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num>=max;
	}
	
	public void dump() {
		if(num<=0) {
			System.out.println("Queue가 비어있습니다.");
		} else {
			for(int i=0; i<num; i++) {
				System.out.print(que[i]+" ");
			}
			System.out.println();
		}
	}
	
}
