//Importing modules
import java.util.*;

//Declaring public class
public class BMI {

	public static void main(String[] args) {
		//Requesting user input (height)
		System.out.print("Enter your height in meters: ");
		Scanner height = new Scanner(System.in);
		float h = height.nextFloat();
		
		//Requesting user input (weight)	
		System.out.print("Enter your weight in kilograms: ");
		Scanner weight = new Scanner(System.in);
		float w = weight.nextFloat();
		
		//Calculating BMI		
		float bmi = w / (h * h);
		System.out.print("Your BMI is " + bmi);
		
		//Declaring comments about the users BMI
		//Using conditional statements		
		if (bmi < 18.5) {
			System.out.println("\nYou are underweight");
		}
		else if (bmi < 25.0) {
			System.out.println("\nYour BMI is normal");
		}
		else if (bmi >= 25.0) {
			System.out.println("\nYou are overweight");
	}
	}
}
	
