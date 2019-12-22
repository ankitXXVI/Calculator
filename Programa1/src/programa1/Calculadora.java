package programa1;

import java.util.Scanner;

public class Calculadora {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double var1 = 0;
		double var2 = 0;
		double result = 1;
		String operation = "";
		
		System.out.println("************************************");
		System.out.println("******Welcome to my Calculator!*****");
		System.out.println("************************************");
		System.out.println("");
		System.out.println("Enter operation number:");
		System.out.println("");
		System.out.println("(1) Addition");
		System.out.println("(2) Substraction");
		System.out.println("(3) Multiplication");
		System.out.println("(4) Division");
		System.out.println("(5) Exponentiation");
		System.out.println("(6) Factorial");
		System.out.println("(7) Square root");
		System.out.println("(8) Percentage value of a number");
		System.out.println("(9) Percentage substraction from a number");
		System.out.println("(10) Percentage addition to a number");
		System.out.println("");
		operation = in.nextLine();
		System.out.println("");
		
		if(!operation.equals("1") && !operation.equals("2") && !operation.equals("3")
		&& !operation.equals("4") && !operation.equals("5") && !operation.equals("6")
		&& !operation.equals("7") && !operation.equals("8") && !operation.equals("9")
		&& !operation.equals("10")) {
			System.out.println("ERROR: Operation not permitted!");
			System.out.println("");
			System.out.println("Press <Enter> to try again");
			if(in.nextLine() != null) {
				in.nextLine();
				clearScreen();
				main(args);
			}
		}
		
		else if(operation.equals("6")) {
			System.out.println("NOTE: Use commas for decimal values.");
			System.out.println("Insert your value:");
			if(in.hasNextDouble()) {
				var1 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			while (result != 0) {
				result = result * var1;
				var1--;
				if (var1 == 0) {
					System.out.println("");
					System.out.println("The result is: " + result);
				}
			}
			System.out.println("");
			System.out.println("Press <Enter> to perform another operation");
			if(in.nextLine() != null) {
				in.nextLine();
				clearScreen();
				main(args);
			}
		}
		
		else if(operation.equals("5")) {
			System.out.println("NOTE: Use commas for decimal values.");
			System.out.println("Insert your base value:");
			if(in.hasNextDouble()) {
				var1 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Insert you exponent value:");
			if(in.hasNextDouble()) {
				var2 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			for(int i = 1; i <= var2; i++) {
				result = result * var1;
			}
			System.out.println("The result is: " + result);
			System.out.println("");
			System.out.println("Press <Enter> to perform another operation");
			if(in.nextLine() != null) {
				in.nextLine();
				clearScreen();
				main(args);
			}
		}
		
		else if(operation.equals("7")) {
			System.out.println("NOTE: Use commas for decimal values.");
			System.out.println("Insert your base value:");
			if(in.hasNextDouble()) {
				var1 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			result = Math.sqrt(var1);
			System.out.println("The result is " + result);
			System.out.println();
			System.out.println("Press <Enter> to perform another operation");
			if(in.nextLine() != null) {
				in.nextLine();
				clearScreen();
				main(args);
			}
		}
		
		else if(operation.equals("8")) {
			System.out.println("NOTE: Use commas for decimal values.");
			System.out.println("Insert your value:");
			if(in.hasNextDouble()) {
				var1 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Insert your percentage value:");
			if(in.hasNextDouble()) {
				var2 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			result = (var1 * var2) / 100;
			System.out.println("The " + var2 + "% of " + var1 + " is " + result);
			System.out.println("");
			System.out.println("Press <Enter> to perform another operation");
			if(in.nextLine() != null) {
				in.nextLine();
				clearScreen();
				main(args);
			}
		}
		
		else if(operation.equals("9")) {
			System.out.println("NOTE: Use commas for decimal values.");
			System.out.println("Insert your value:");
			if(in.hasNextDouble()) {
				var1 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Insert your percentage value:");
			if(in.hasNextDouble()) {
				var2 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			result = var1 - ((var1 * var2) / 100);
			System.out.println(var1 + " - " + var2 + "%" + " is " + result);
			System.out.println("");
			System.out.println("Press <Enter> to perform another operation");
			if(in.nextLine() != null) {
				in.nextLine();
				clearScreen();
				main(args);
			}
		}
		
		else if(operation.equals("10")) {
			System.out.println("NOTE: Use commas for decimal values.");
			System.out.println("Insert your value:");
			if(in.hasNextDouble()) {
				var1 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Insert your percentage value:");
			if(in.hasNextDouble()) {
				var2 = in.nextDouble();
			} else {
				System.out.println("");
				System.out.println("*****Value not permitted!*****");
				System.out.println("");
				System.out.println("Press <Enter> to try again");
				if(in.nextLine() != null) {
					in.nextLine();
					clearScreen();
					main(args);
				}
			}
			System.out.println("");
			System.out.println("");
			result = var1 + ((var1 * var2) / 100);
			System.out.println(var1 + " + " + var2 + "%" + " is " + result);
			System.out.println("");
			System.out.println("Press <Enter> to perform another operation");
			if(in.nextLine() != null) {
				in.nextLine();
				clearScreen();
				main(args);
			}
		}
		
		else {
			System.out.println("NOTE: Use commas for decimal values.");
			System.out.println("Insert your first value");
			if(in.hasNextDouble()) {
				var1 = in.nextDouble();
			} else {
				System.out.println("*****Value not permitted!*****");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Insert your second value:");
			if(in.hasNextDouble()) {
				var2 = in.nextDouble();
			} else {
				System.out.println("*****Value not permitted!*****");
			}
			System.out.println("");
			System.out.println("");
			
			if(operation.equals("1")) {
				result = var1 + var2;
				System.out.println("The result is: " + result);	
			}
			
			else if(operation.equals("2")) {
				result = var1 - var2;
				System.out.println("The result is: " + result);
			}
			
			else if(operation.equals("3")) {
				result = var1 * var2;
				System.out.println("The result is: " + result);
			}
			
			else if(operation.equals("4")) {
				result = var1 / var2;
				System.out.println("The result is: " + result);
			}
		}
		
		System.out.println("");
		System.out.println("Press <Enter> to perform another operation");
		if(in.nextLine() != null) {
			in.nextLine();
			clearScreen();
			main(args);
		}	
	}
	
	public static void clearScreen() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}