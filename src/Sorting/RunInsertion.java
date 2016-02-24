package Sorting;


public class RunInsertion {
	public static void InsertionSort () {
		
		int[] mass = new int[1000];
		int b;
		for (b = 0; b < mass.length; b++){
			mass[b] = (int) (Math.random() * 1000);		
			System.out.print(" " + mass[b]);
		}
		InsertionSort sort = new InsertionSort();
		sort.InsertionSortMethod(mass);
	}
}