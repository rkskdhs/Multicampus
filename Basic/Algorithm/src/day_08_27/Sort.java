package day_08_27;

public class Sort {

	public static boolean isless(Comparable a, Comparable b) {
		return a.compareTo(b)<0;
	}
	public static void bubbleSort(Comparable[] a) {
		for(int i =a.length-1 ; i>0 ;i--) {
			for(int j=0; j < i ;j++) {
				if(!isless(a[j] , a[j+1])) {
					swap(a, j, j+1);	
				}
			}
		}
		//print(a);
	}

	public static void selectionSort1(Comparable[] a) {
		for(int i = 0 ; i<a.length-1 ;i++) {
			for(int j = i+1; j<a.length ;j++) {
				if(!isless(a[i] , a[j])) {
					swap(a, i, j);
				}
			}
		}
		//print(a);
	}
	public static void selectionSort2(Comparable[] a) {
		for(int i = 0 ; i<a.length-1 ;i++) {
			int minindex = i;
			for(int j = i+1; j<a.length ;j++) {
				if(!isless(a[minindex],a[j])) {
					minindex = j;
				}
			}
			if(minindex != i)
				swap(a, minindex, i);
		}
		//print(a);
	}
	public static void insertionSort(Comparable[] a) {
		for(int i = 1; i<a.length;i++) {
			Comparable temp = a[i];
			for(int j=0;j<i;j++) {
				if(!isless(temp , a[j])) {
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
	static Comparable [] temp;

	public static void mergeSort(Comparable[] a, int begin, int end) {
		temp = new Comparable[a.length];
		if(begin<end ) {
			int mid = (begin+end)/2;
			mergeSort(a, begin, mid);
			mergeSort(a, mid+1, end);//쪼개는 작업

			for(int i = begin; i<=end; i++) {
				temp[i] = a[i];

			}
			int i = begin, j= mid+1, k=begin;
			while(i<= mid && j<=end) {
				if(isless(temp[i],temp[j])) {
					a[k] = temp[i];
					i++;
				}else {
					a[k]= temp[j];
					j++;
				}
				k++;
			}
			while (i<= mid) {
				a[k++] = temp[i++];
			}
			while(j<= end){
				a[k++] = temp[j++];
			}
		}

	}


	private static void swap(Comparable[] a , int i,int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private static void print(Comparable[] a ) {
		for(Comparable data :a) {
			System.out.print(data+"  ");
		}
		System.out.println();
	}

}







