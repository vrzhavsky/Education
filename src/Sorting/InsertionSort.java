package Sorting;

public class InsertionSort {
	int arr[];
	public void  InsertionSortMethod(int [ ] arr) {
		this.arr = arr;
		    for(int i = 1; i < arr.length; i++){
		        int Element = arr[i];
		        int previous = i - 1;
		        while(previous >= 0 && arr[previous] > Element){
		            arr[previous+1] = arr[previous];
		            previous--;
		        }
		        arr[previous+1] = Element;
		    }
		    System.out.println();
	for (int b = 0; b < arr.length; b++){	
		System.out.print(" " + arr[b]);
	}
}
}