package DatosPersonales;

public class Tarea8 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2}; //
		 int maxNumber = 0;
		 int maxCount = 0;
		 for (int i = 0; i < array.length; i++) {
			 int count = 0;
			 for (int j = 0; j <array.length; j++) {
				 if (array [j] == array[i]){
					 count++;
				 }
			 }
			 if (count > maxCount) {
				 maxCount = count;
				 maxNumber = array[i];
				 
			 }
		 }
		 System.out.println ("El numero con mas ocurrencias en el array es: " + maxNumber);

	}
}
