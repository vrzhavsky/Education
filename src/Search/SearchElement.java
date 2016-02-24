package Search;
import java.util.Scanner;

public class SearchElement {
	int[] arr;
	Scanner s;
	public int input(){
		  
		  int count = 0;
		  boolean Putted = false;
		  this.s = new Scanner(System.in);
		    while (Putted == false){
		    try{
		     count = Integer.parseInt(s.nextLine());
		     if (count <= 0){
		      System.out.println("Only positive integer number is required. Please try again.");
		      Putted = false;
		     } else {
		      Putted = true;
		      }
		     } catch (NumberFormatException e) {
		      System.out.println("Inputted data is incorrect, please try again");
		      Putted = false;
		     }
		    }
		    
		  return count;
		 }
public void Search () {
	int count = this.input();
	this.arr = new int[count];
	this.random();
	this.sortMethod(arr);
	System.out.println("One by one: " + this.compare(arr));
	int count3 = this.input();
	System.out.println("Binary: " + this.binary(0,count-1,arr,count3));
		}
private void random(){
	int b;
	for (b = 0; b < arr.length; b++){
		arr[b] = (int) (Math.random() * 10);
		
		}
}

private boolean binary(int min, int max, int[] arr, int value){
	boolean numb = false;
	if(min < max){
	int mid = (min + max) / 2;
	if(value > arr[mid]){
		numb = this.binary(mid+1, max, arr, value);
	}
	if(value < arr[mid]){
		numb = this.binary(min, mid-1, arr, value);
	}
	if(value == arr[mid]){
		numb = true;
	}
	} else numb = false;
	return numb;
}


private  void sortMethod(int[] a) {
	    for(int i = 1; i < a.length; i++){
	        int Element = a[i];
	        int previous = i - 1;
	        while(previous >= 0 && a[previous] > Element){
	            a[previous+1] = a[previous];
	            previous--;
	        }
	        a[previous+1] = Element;
	    }
	    for (int b = 0; b < a.length; b++){	
	System.out.print(" " + a[b]);
	}
}
private boolean compare(int[] a){
	int b;
	boolean c = false;
	System.out.println();
	int count2 = this.input();
	for (b = 0; b < a.length; b++){
	if (a[b] == count2){
		c = true;

		break;
	}

	}
	return c;
	}
}
