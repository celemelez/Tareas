package DatosPersonales;

import javax.swing.JOptionPane;

public class MesesDelAño {
	public static void main(String[] args) {
		String nombreMes = JOptionPane.showInputDialog("ingrese nombre del mes:").toLowerCase();
		switch (nombreMes) {
        case "enero":
            System.out.println("El numero del mes Enero es 1");
            break;
        case "febrero":
              System.out.println("El numero del mes Febrero es 2");
              break;
        case "Marzo":
               System.out.println("El numero del mes Marzo es 3");
               break;
        case "Abril":
              System.out.println("El numero del mes Abril es 4");
              break;
        case "Mayo":
              System.out.println("El numero del mes Mayo es 5");
              break;
        case "Junio":
            System.out.println("El numero del mes Junio es 6");
            break;
        case "Julio":
            System.out.println("El numero del mes Julio es 7");
            break;
        }
	}
}
