import java.util.ArrayList;
public class Ejercicio5 {

	/*Realice un algoritmo que use un Método con parámetros y con retorno que recibe un ArrayList de enteros y 
	 * devuelve el valor máximo de la lista
	 */
	    public static int encontrarValorMaximo(ArrayList<Integer> lista) {
	        if (lista.isEmpty()) {
	            throw new IllegalArgumentException("La lista está vacía");
	        }

	        int maximo = lista.get(0);

	        for (int i = 1; i < lista.size(); i++) {
	            int elemento = lista.get(i);
	            if (elemento > maximo) {
	                maximo = elemento;
	            }
	        }

	        return maximo;
	    }

	    public static void main(String[] args) {
	        ArrayList<Integer> listaEnteros = new ArrayList<>();
	        listaEnteros.add(5);
	        listaEnteros.add(10);
	        listaEnteros.add(2);
	        listaEnteros.add(8);
	        listaEnteros.add(15);
	        
	        int maximo = encontrarValorMaximo(listaEnteros);
	        
	        System.out.println("El valor máximo en la lista es: " + maximo);
	    }
	}
		
