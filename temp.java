import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int temp = sc.nextInt();
		if (temp > 30) {
			System.out.println("Hot");
		}
		else {
			System.out.println("Normal");
		}

	}

}
