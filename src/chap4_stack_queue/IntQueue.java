package chap4_stack_queue;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int max) {
		this.max = max;
		num = front = rear = 0;
		
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			this.max = 0;
			e.printStackTrace();
		}
		
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if(num>=max) {
			throw new OverflowIntQueueException();
		}
		
		que[rear++] = x;
		num++;
		
		if(rear==max) {
			rear = 0;
		}
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		
		int temp = que[front++];
		num--;
		if(front==max) {
			front = 0;
		}
		
		return temp;
	}
	
	public int peek() throws EmptyIntQueueException {
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front) % max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
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
			for(int i =0; i<num; i++) {
				System.out.println(que[(front+i)%max] + " ");
			}
			System.out.println();
		}
	}
	
	public int search(int x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max]==x) {
				return i+1;
			}
		}
		
		return 0;
	}
}
