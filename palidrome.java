import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int reverse = 0;
		int number = num;
		
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		//System.out.println(reverse);
		if (reverse == number) {
			System.out.println("Palidrome");
		} else {
			System.out.println("Not a Palidrome");
		}

	}

}
