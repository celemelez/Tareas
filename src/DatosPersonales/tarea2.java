package DatosPersonales;

import javax.swing.JOptionPane;

public class tarea2 {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre:");
		String apellido = JOptionPane.showInputDialog(null,"Ingrese su apellido:");
	    String edad = JOptionPane.showInputDialog(null,"Ingrese su edad:");
	    String direccion = JOptionPane.showInputDialog(null,"Ingrese su dirección:");
	    String mensaje = "Datos ingresados:\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nDirección: " + direccion;
	    JOptionPane.showMessageDialog(null, mensaje);
	}
}
  

