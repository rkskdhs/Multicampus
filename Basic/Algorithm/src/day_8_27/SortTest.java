package day_8_27;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		//int[] data = {9,8,4,1,7};
		//System.out.println(Arrays.toString(data));
		//Sort.bubbleSort(data);
		//Sort.selectionSort2(data);
		//Sort.insertionSort(data);
		
        int[] data = new int[100000];
        long start;
        long end;
        for(int i =0 ; i<data.length;i++) {
        	data[i] = (int) (Math.random()*10000+1);
        }
        int[] data1,data2,data3;
        data1 = data.clone(); 
        data2 = data.clone(); 
        data3 = data.clone(); 
        
        start = System.currentTimeMillis();
        Sort.bubbleSort(data);
        end = System.currentTimeMillis();
        System.out.println("bubbleSort : "+(end-start)+" ms");
        
        start = System.currentTimeMillis();
        Sort.selectionSort1(data1);
        end = System.currentTimeMillis();
        System.out.println("selectionSort1 : "+(end-start)+" ms");
        
        start = System.currentTimeMillis();
        Sort.selectionSort2(data2);
        end = System.currentTimeMillis();
        System.out.println("selectionSort2 : "+(end-start)+" ms");
        
        start = System.currentTimeMillis();
        Sort.insertionSort(data3);
        end = System.currentTimeMillis();
        System.out.println("insertionSort : "+(end-start)+" ms");
        
        
	}
}








