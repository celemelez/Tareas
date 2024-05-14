package DatosPersonales;
import javax.swing.JOptionPane;

public class NumeroPar {
	public static void main(String[] args) {
		
		 String input = JOptionPane.showInputDialog("Ingresa número entero:");
        try {
            int numero = Integer.parseInt(input);
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: ingrese un número entero.");
		
	}
	}
}
