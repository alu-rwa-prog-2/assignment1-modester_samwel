//Authors: Samwel Maisiba, Modester Mwangi
//Usernames: Sammyiel, Modester-mw

//Importing modules
import java.util.*;

//Declaring public class
public class BMI {

	public static void main(String[] args) {
		//Users name
		System.out.print("Enter your name ");
		@SuppressWarnings("resource")
		Scanner username = new Scanner(System.in);
		String name = username.next();
		
		//Requesting user input (height)
		System.out.print("Enter your height in meters: ");
		@SuppressWarnings("resource")
		Scanner height = new Scanner(System.in);
		float h = height.nextFloat();
		
		//Requesting user input (weight)	
		System.out.print("Enter your weight in kilograms: ");
		@SuppressWarnings("resource")
		Scanner weight = new Scanner(System.in);
		float w = weight.nextFloat();
		
		//Calculating BMI		
		float bmi = w / (h * h);
		System.out.print("Hey " + name + ", your BMI is " + bmi);
		
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
	
