package FindMinimum;

public class FindMinimum {
public static int findMin1(int a,int b){
	int low = 0;
	if (a < b){
		low = a;
	}
	else if(a > b){
		low = b;
	}
	return low;
}
public static int findMin2(int c, int d ,int e){
	int low = 0;
	int mm = FindMinimum.findMin1(c,d);
	if(mm < c){
		low = mm;
	}
		else if(mm > c){
			low = c;
		}
		return low;
}

public static int findMin3(int f, int g ,int h, int j){
	int low = 0;
	int mm = FindMinimum.findMin2(f,g,h);
		if(mm < j){
			low = mm;
	}
		else if(mm > j){
			low = j;
		}
		return low;
}
}
