package day_08_27;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
	
      
        long start;
        long end;
    String[] data = {"g","k","a","m","z","p","t","y"};
     
//     	Account[] data = {
//     			new Account("2017-01",800),
//     			new Account("2018-05",500),
//     			new Account("2013-04",700)
//     	};
//        
//        start = System.currentTimeMillis();
//        Sort.bubbleSort(data);
//        end = System.currentTimeMillis();
//        System.out.println("bubbleSort : "+(end-start)+" ms");
//        
//        start = System.currentTimeMillis();
//        Sort.selectionSort1(data);
//        end = System.currentTimeMillis();
//        System.out.println("selectionSort : "+(end-start)+" ms");
//        
//        start = System.currentTimeMillis();
//        Sort.selectionSort2(data);
//        end = System.currentTimeMillis();
//        System.out.println("selectionSort : "+(end-start)+" ms");
//        
    
    	System.out.println(Arrays.toString(data));
        start = System.currentTimeMillis();
        Sort.mergeSort(data,0,data.length-1);
        end = System.currentTimeMillis();
        System.out.println("mergeSort : "+(end-start)+" ms");
        System.out.println(Arrays.toString(data));
        
        
	}
}








