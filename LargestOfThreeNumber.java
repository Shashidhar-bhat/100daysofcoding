
public class LargestOfThreeNumber {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 50;
		int c = 80;
		
		int larg = 0;
		
		if (a >= b && a >= c) {
			larg = a;
		} else 	if (b >= c && b >= a) {
			larg = b;
		} else {
			larg = c;
		}
		System.out.println(larg);
	}

}
