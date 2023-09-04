
public class Ejercicio6 {

	
	/*Realice un algoritmo que use un Método con parámetros y con retorno que recibe dos arreglos de enteros del mismo tamaño y 
	 * devuelve un nuevo arreglo que contiene la suma de los elementos de ambos arreglos:
	 */
	    public static int[] sumaArreglos(int[] arreglo1, int[] arreglo2) {  
	        if (arreglo1.length != arreglo2.length) {
	            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
	        }

	        int[] resultado = new int[arreglo1.length];

	        for (int i = 0; i < arreglo1.length; i++) {
	            resultado[i] = arreglo1[i] + arreglo2[i];
	        }

	        return resultado;
	    }

	    public static void main(String[] args) {
	        int[] arreglo1 = {1, 2, 3, 4, 5};
	        int[] arreglo2 = {6, 7, 8, 9, 10};

	        int[] resultado = sumaArreglos(arreglo1, arreglo2);

	        for (int elemento : resultado) {
	            System.out.print(elemento + " ");
	        }
	    }
	}
