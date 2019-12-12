package programa1;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double var1 = 0;
		double var2 = 0;
		double resultado = 1;
		String operacion;
		
		System.out.println(" ____________________________________");
		System.out.println("|************************************|");
		System.out.println("|******Welcome to my Calculator!*****|");
		System.out.println("|************************************|");
		System.out.println("|____________________________________|");
		System.out.println("");
		System.out.println("*****What operation would you like to do?*****");
		System.out.println("*******Available Operations:******");
		System.out.println("Addition, Substraction, Multiplication, Division, Exponentiation and Factorial.");
		operacion = in.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("*****Insert your first value*****");
		if(in.hasNextDouble()) {
			var1 = in.nextDouble();
		} else {
			System.out.println("*****Value not permitted!*****");
		}
		System.out.println();
		System.out.println();
		System.out.println("*****Insert your second value*****");
		if(in.hasNextDouble()) {
			var2 = in.nextDouble();		
		} else {
			System.out.println("*****Value not permitted!*****");
		}
		System.out.println();
		System.out.println();

		if("Addition".equalsIgnoreCase(operacion)) {
			resultado = var1 + var2;
			System.out.println("The result is: " + resultado);
			
		} else if ("Substraction".equalsIgnoreCase(operacion)) {
			resultado = var1 - var2;
			System.out.println("The result is: " + resultado);
			
		} else if ("Multiplication".equalsIgnoreCase(operacion)) {
			resultado = var1 * var2;
			System.out.println("The result is: " + resultado);
			
		} else if ("Division".equalsIgnoreCase(operacion)) {
			resultado = var1 / var2;
			System.out.println("The result is: " + resultado);
			
			
		} else if ("Exponentiation".equalsIgnoreCase(operacion)){
			for(int i = 1; i <= var2; i++) {
				resultado = resultado * var1;
			}
			System.out.println("The result is: " + resultado);
		
			
		} else if ("factorial".equalsIgnoreCase(operacion)) {
			while (resultado != 0) {
				resultado = resultado * var1;
				var1--;
					if(var1 == 0) {
						System.out.println("The result is: " + resultado);
					}
			}
	
		} else {
			System.out.println("ERROR: Operation not permitted!");

		}
		
		System.out.println("Press <Enter> to perform another operation");
		if(in.nextLine() != null) {
			in.nextLine();
			main(args);
		}
	}
}
