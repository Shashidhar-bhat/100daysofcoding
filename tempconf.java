import java.util.Scanner;

public class tempconf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int temp = sc.nextInt();
		if (temp > 20 && temp <30 ) {
			System.out.println("Confort");
		}
		else {
			System.out.println("Crusial");
		}

	}

}