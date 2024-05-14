package DatosPersonales;
import java.util.Scanner;

public class OrdenarNombres {
	public static void main(String[] args) {
		String bar = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese el nombre1");	
		String nombre1 = scanner.nextLine();
		System.out.println("ingrese el nombre2");
		String nombre2 = scanner.nextLine();
		System.out.println("ingrese el nombre3");
		String nombre3 = scanner.nextLine();
		if ((nombre1.length() > nombre2.length()) && (nombre1.length() > nombre3.length())){
			System.out.println (nombre1);
		}if ((nombre2.length() > nombre1.length()) && (nombre2.length() > nombre3.length())){
			System.out.println (nombre2);
		}else {
			System.out.println (nombre3);
			
		
		}
		}
		
}