package tarea5_calculadora;

import java.util.Scanner;


public class principal_cal {

public static void  main(String[]args) {
		
		Scanner input = new Scanner(System.in);
	
		CalculoIva precioded = new CalculoIva();
		System.out.println("Ingrese el precio: " );
		precioded.setdeducion(input.nextDouble());
		

		System.out.println("El precio total con IVA es: "+precioded.calcNeto());


	}
}