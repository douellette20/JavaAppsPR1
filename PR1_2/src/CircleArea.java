import java.util.Scanner;

public class CircleArea {

	final static double PI = 3.14;
	public static void main(String[] args) {
		System.out.println("This program calculates and displays the area of a circle given its radius.");
		System.out.println("Enter a radius (integer)");
		Scanner scn = new Scanner(System.in);
		int rad = scn.nextInt();
		double area = (PI * rad * rad);
		System.out.printf("%f is the area of the circle.", area);
	}

}
