package convertDivisas;

import java.util.Scanner;


public class DivisasPrincipal {

public static void  main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		

	            	SolesPesos soldivisa = new SolesPesos();
	        		System.out.println("Ingrese la cantidad de soles a convertir: " );
	        		soldivisa.setdivisa(input.nextDouble());



		System.out.println("El total convertido de Soles a Pesos: "+soldivisa.cambiodiv());
		System.out.println("El total convertido es Soles a Dolares: "+soldivisa.cambiodiv2());
		System.out.println("El total convertido es Soles a Quetzales: "+soldivisa.cambiodiv3());

	}
}