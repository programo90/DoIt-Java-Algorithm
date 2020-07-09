package chap7_set;

public class Q1_Q2_IntSet {

	private int max;
	private int num;
	private int[] set;
	
	public Q1_Q2_IntSet(int capacity) {
		max = capacity;
		num = 0;
		try {
			set = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
		
	}

	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public int indexOf(int n) {
		for(int i=0; i<num; i++) {
			if(set[i]==n) return i;
		}

		return -1;
	}
	
	public boolean contains(int n) {
		return indexOf(n)!=-1?true:false;
	}
	
	public boolean add(int n) {
		if(num>=max||contains(n)) return false;
		else {
			set[num++] = n;
			return true;
		}
	}
	
	public boolean remove(int n) {
		int idx = indexOf(n);
		if(num<=0 || idx==-1) {
			return false;
		} else {
			set[idx] = set[--num];
			return true;
		}
	}
	
	public void copyTo(Q1_Q2_IntSet s) {
		int n = s.max<num? s.max:num;
		for(int i=0; i<num; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	public void copyFrom(Q1_Q2_IntSet s) {
		int n = max>s.num?s.num:max;
		for(int i=0; i<n;i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	public boolean equalTo(Q1_Q2_IntSet s) {
		if(num!=s.num) return false;
		
		for(int i=0; i<num; i++) {
			int j=0;
			for(;j<s.num;j++) {
				if(s.set[i]==set[i]) break;
			}
			if(j==s.num) return false;
		}
		
		return true;
	}
	
	public void unionOf(Q1_Q2_IntSet s1, Q1_Q2_IntSet s2) {
		copyFrom(s1);
		for(int i=0;i<s2.num;i++) {
			add(s2.set[i]);
		}
	}
	
	public String toString() {
		StringBuffer sf = new StringBuffer("{ ");
		for(int i=0; i<num; i++) {
			sf.append(set[i]+" ");
		sf.append("}");
		}
		return sf.toString();
	}
	
	public boolean isEmpty() {
		return num==0?true:false;
	}
	
	public boolean isFull() {
		return num==max?true:false;
	}
	
	public void clear() {
		num=0;
	}
	
	public boolean add(Q1_Q2_IntSet s) {
		boolean flag = false;
		for(int i=0; i<num; i++) {
			if(add(s.set[i])==true) {
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean retain(Q1_Q2_IntSet s) {
		boolean flag = false;
		for(int i=0; i<num; i++) {
			if(s.contains(set[i]) == false) {
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean remove(Q1_Q2_IntSet s) {
		boolean flag = false;
		for(int i=0; i<num; i++) {
			if(s.contains(set[i])==true) {
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	}

}
