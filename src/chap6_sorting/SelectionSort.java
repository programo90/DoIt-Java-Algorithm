package chap6_sorting;

public class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0; i<n; i++) {
			int min = i;
			for(int j=i+1;j<n; j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}//for selection pass
			swap(a,i,min);
		}// for
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
