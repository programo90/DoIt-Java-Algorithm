package chap7_set;

public class Q3_IntSet {

	private int max;
	private int num;
	private int[] set;
	
	public Q3_IntSet(int capacity) {
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
	
	public void copyTo(Q3_IntSet s) {
		int n = s.max<num? s.max:num;
		for(int i=0; i<num; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	public void copyFrom(Q3_IntSet s) {
		int n = max>s.num?s.num:max;
		for(int i=0; i<n;i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	public boolean equalTo(Q3_IntSet s) {
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
	
	public void unionOf(Q3_IntSet s1, Q3_IntSet s2) {
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
	
	public boolean isSubsetOf(Q3_IntSet s) {
		boolean flag = true;
		for(int i=0; i<num; i++) {
			if(s.contains(set[i])!=true) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public boolean isProperSubsetOf(Q3_IntSet s) {
		boolean flag = true;
		if(isSubsetOf(s)!=true) {
			flag =false;
		} else {
			if(equalTo(s)==true) {
				flag = false;
			}
		}
		
		
		return flag;
	}

}
