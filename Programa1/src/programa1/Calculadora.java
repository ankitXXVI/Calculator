package programa1;

import java.util.Scanner;

public class Calculadora {
	
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
		System.out.println("");
		operation = in.nextLine();
		System.out.println("");
		
		if(!operation.equals("1") && !operation.equals("2") && !operation.equals("3") && !operation.equals("4") && !operation.equals("5") && !operation.equals("6")) {
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