import java.util.Scanner;

public class multipleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num % 5 == 0) {
			System.out.println("Multiple by 5");
		}
		else {
			System.out.println("Not multiple by 5");
		}

	}

}
