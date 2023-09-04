
public class Ejercicio4 {
	
	/*
	 Escribe un método con parámetros y con retorno que reciba un arreglo de enteros y devuelva el valor máximo del arreglo.
	 */
	
	public int calcularPromedio(int[] numeros) {
	    int suma = 0;
	    for (int i = 0; i < numeros.length; i++) {
	        suma += numeros[i];
	    }
	    int promedio = suma / numeros.length;
	    return promedio;
	}
}


