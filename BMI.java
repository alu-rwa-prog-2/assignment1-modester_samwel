<<<<<<< HEAD
//Authors: Samwel Maisiba, Modester Mwangi
//Usernames: Sammyiel, Modester-mw

=======
>>>>>>> dd0aed75a704d6ef583eb453e471a6fe27373d62
//Importing modules
import java.util.*;

//Declaring public class
public class BMI {

	public static void main(String[] args) {
<<<<<<< HEAD
		//Users name
		System.out.print("Enter your name ");
		@SuppressWarnings("resource")
		Scanner username = new Scanner(System.in);
		String name = username.next();
		
		//Requesting user input (height)
		System.out.print("Enter your height in meters: ");
		@SuppressWarnings("resource")
=======
		//Requesting user input (height)
		System.out.print("Enter your height in meters: ");
>>>>>>> dd0aed75a704d6ef583eb453e471a6fe27373d62
		Scanner height = new Scanner(System.in);
		float h = height.nextFloat();
		
		//Requesting user input (weight)	
		System.out.print("Enter your weight in kilograms: ");
<<<<<<< HEAD
		@SuppressWarnings("resource")
=======
>>>>>>> dd0aed75a704d6ef583eb453e471a6fe27373d62
		Scanner weight = new Scanner(System.in);
		float w = weight.nextFloat();
		
		//Calculating BMI		
		float bmi = w / (h * h);
<<<<<<< HEAD
		System.out.print("Hey " + name + ", your BMI is " + bmi);
=======
		System.out.print("Your BMI is " + bmi);
>>>>>>> dd0aed75a704d6ef583eb453e471a6fe27373d62
		
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
	
