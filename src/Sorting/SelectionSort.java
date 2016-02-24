package Sorting;

public class SelectionSort {
	public static void SelectionSortMethod (int[] arr){
	    int min;
	    int temp;
	    for (int i = 0; i < arr.length-1; i++){
	        min = i;
	        for (int search = i+1; search < arr.length; search++){
	            if (arr[search] < arr[min]){
	                min = search;
	            }
	        }
	        temp = arr[min];
	        arr[min] = arr[i];
	        arr[i] = temp;
	        }
	    
	    System.out.println();
    	for (int b = 0; b < arr.length; b++){	
    		System.out.print(" " + arr[b]);
	}
	
	}
}