package CountElements;

import java.util.Scanner;

public class Count {
	Scanner s;
	public void countMethod() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
	String str = "caallday";
	char temp =s.charAt(0);
	    int e = 0;
	    for (int i = 0; i < str.length(); ++i) {
	        if (temp == str.charAt(i)) {
	            e++;
	        }
	     }
    	System.out.println("Your element occurs " + e + " times! :)");
   
	}
}


