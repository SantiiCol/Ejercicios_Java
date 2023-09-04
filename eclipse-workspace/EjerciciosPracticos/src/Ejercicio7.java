import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio7 {
	
	/*Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap o HashTable donde las claves sean palabras en inglés y 
	 * los valores sean las traducciones al español. Permite al usuario ingresar una palabra en inglés y 
	 * muestra su traducción en español si está en el diccionario.
	 */
	
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("hello", "hola");
        diccionario.put("apple", "manzana");
        diccionario.put("car", "coche");
        diccionario.put("house", "casa");
        diccionario.put("book", "libro");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese palabra en ingles: ");
        String palabraIngles = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para ser insensible a mayúsculas/minúsculas
        

        String traduccion = diccionario.get(palabraIngles);

        if (traduccion != null) {
            System.out.println("Traducción al español: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }

        scanner.close();
    }
}