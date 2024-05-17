package DatosPersonales;

import java.util.Scanner;

public class DiasDelMesConAñosBisiestos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        int dias = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("Mes ingresado no válido.");
        }

        if (dias > 0) {
            System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
        }
	}

}
