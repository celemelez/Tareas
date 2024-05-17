package PaqueteT7;
import java.util.Scanner;

public class MayorArray {
	public static void main(String[] args) {
		int[] arreglo = new int[10];

        Scanner scanner = new Scanner(System.in);

        // Llenar el arreglo con valores ingresados por el usuario
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int maximo = arreglo[0];
        
        // Encontrar el número mayor en el arreglo
        
        for (int i = 1; i < 10; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El número mayor en el arreglo es: " + maximo);
    }
	}
