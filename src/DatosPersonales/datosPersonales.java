package DatosPersonales;

import java.io.InputStream;
import java.util.Scanner;

public class datosPersonales {

	
	 public static void main(String[ ] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println ("ingrese nombre:");
		 String nombre1 = scanner.nextLine();
		 System.out.println ("ingrese apellido");
		 String apellido1 = scanner.nextLine();
		 System.out.println ("ingrese lugar de residencia");
		 String residencia1 = scanner.nextLine();
		 System.out.println ("ingrese edad");
		 int edad1 = scanner.nextInt();
		 
		 System.out.println("El nombre es: " + nombre1);
		 System.out.println("El apellido es: " + apellido1);
		 System.out.println("El lugar de residencia es: " + residencia1);
		 System.out.println("La edad es: " + edad1);
		 
		
	 }
	 
	 
}
