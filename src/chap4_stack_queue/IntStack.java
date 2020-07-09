package chap4_stack_queue;

public class IntStack {

	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStack(int max) {
		this.max = max;
		ptr = 0;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			e.printStackTrace();
		}
	}
	
	public int push(int num) throws OverflowIntStackException {
		if(ptr>=max) {
			throw new OverflowIntStackException();
		}
		
		return stk[ptr++] = num;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr<=0) {
			throw new EmptyIntStackException();
		}
		
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		return stk[ptr-1];
	}
	
	public int indexOf(int num) {
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i]==num) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int size() {
		return ptr;
	}
	
	public int capacity() {
		return max;
	}
	
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	public boolean isFull() {
		return ptr>=max;
	}
	
	public void dump() {
		if(ptr<=0) {
			System.out.println("stack이 비어있습니다.");
		} else {
			for(int i=0; i<ptr; i++) {
				System.out.print(stk[i]+" ");
			}
			System.out.println();
		}
	}
}
