package chap4_stack_queue;

public class Q7_IntDeque {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {}
	}
	
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {}
	}
	
	public Q7_IntDeque(int max) {
		this.max = max;
		num = front = rear = 0;
		
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
			e.printStackTrace();
		}
	}
	
	public int enqueRear(int x) throws OverflowIntDequeException {
		if(num>=max) {
			throw new OverflowIntDequeException();
		}
		que[rear++] = x;
		num++;
		if(rear==max) {
			rear = 0;
		}
		
		return x;
	}
	
	public int enqueFront(int x) throws OverflowIntDequeException {
		if(num>=max) {
			throw new OverflowIntDequeException();
		}
		num++;
		if(--front<0) {
			front = max-1;
		}
		que[front] = x;
		
		
		return x;
	}
	
	
	
	public int dequeFront() throws EmptyIntDequeException {
		if(num<=0) {
			throw new EmptyIntDequeException();
		}
		
		int temp = que[front++];
		num--;
		if(front==max) {
			front = 0;
		}
		
		return temp;
	}
	
	public int dequeRear() throws EmptyIntDequeException {
		if(num<=0) {
			throw new EmptyIntDequeException();
		}
		num--;
		if(--rear<0) {
			rear = max-1;
		}
		return que[rear];
	}
	
	public int peekFront() throws EmptyIntDequeException {
		if(num<=0) {
			throw new EmptyIntDequeException();
		}
		return que[front];
	}
	
	public int peekRear() throws EmptyIntDequeException {
		if(num<=0) {
			throw new EmptyIntDequeException();
		}
		return que[rear-1];
	}
	
	public void clear() {
		front = num = rear = 0;
	}
	
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (front+i)%max;
			if(que[idx]==x) {
				return idx; 
			}
		}
		return -1;
	}
	
	public int size() {
		return max;
	}
	
	public int capacity() {
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
			System.out.println("Deck 이 비어있습니다.");
		} else {
			for(int i=0; i<num; i++) {
				System.out.print(que[(front+i)%max]+" ");
			}
			System.out.println();
		}
	}
	
}
