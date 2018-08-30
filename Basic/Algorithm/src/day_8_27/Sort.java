package day_8_27;

public class Sort {

	public static void bubbleSort(int[] a) {
		for(int i =a.length-1 ; i>0 ;i--) {
			for(int j=0; j < i ;j++) {
				if(a[j] > a[j+1]) {
				   swap(a, j, j+1);	
				}
			}
		}
		//print(a);
	}
	
	public static void selectionSort1(int[] a) {
		for(int i = 0 ; i<a.length-1 ;i++) {
			for(int j = i+1; j<a.length ;j++) {
				if(a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
		//print(a);
	}
	public static void selectionSort2(int[] a) {
		for(int i = 0 ; i<a.length-1 ;i++) {
			int minindex = i;
			for(int j = i+1; j<a.length ;j++) {
				if(a[minindex] > a[j]) {
					minindex = j;
				}
			}
			if(minindex != i)
				swap(a, minindex, i);
		}
		//print(a);
	}
	public static void insertionSort(int[] a) {
		for(int i = 1; i<a.length;i++) {
			int temp = a[i];
			for(int j=0;j<i;j++) {
				if(temp < a[j]) {
					for(int k =i-1; k >=j;k--) {
						a[k+1] = a[k];
					}
					a[j] = temp;
					break;
				}
			}
		}
		//print(a);
	}
	
	private static void swap(int[] a , int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private static void print(int[] a ) {
		for(int data :a) {
			System.out.print(data+"  ");
		}
		System.out.println();
	}
	
}







