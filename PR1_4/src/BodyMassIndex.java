import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		System.out.println("This program calculates BMI based on height and weight.");
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the weight in pounds (integer):");
		int weight = scn.nextInt();
		System.out.println("Enter the height in inches (integer):");
		int height = scn.nextInt();
		double BMI = (weight * 703)/(height * height);
		System.out.printf("BMI is %f\n\n",  BMI);
		System.out.println("BMI Values");
		System.out.println("Underweight: Less than 18.5");
		System.out.println("Normal: 18.5 - 24.9");
		System.out.println("Overweight: 25 - 29.9");
		System.out.println("Obese: 30+");
	}

}
