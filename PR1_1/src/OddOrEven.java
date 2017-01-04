import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		System.out.printf("Enter an integer to determine whether it is odd or even\n");
		Scanner inReader = new Scanner(System.in);
		int input = inReader.nextInt();
		if (input % 2 == 0)
			System.out.printf("%d is even", input);
		else
			System.out.printf("%d is odd", input);

	}

}
