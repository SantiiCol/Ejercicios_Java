import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio7 {
	
	/*Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap o HashTable donde las claves sean palabras en ingl�s y 
	 * los valores sean las traducciones al espa�ol. Permite al usuario ingresar una palabra en ingl�s y 
	 * muestra su traducci�n en espa�ol si est� en el diccionario.
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
        String palabraIngles = scanner.nextLine().toLowerCase(); // Convertir a min�sculas para ser insensible a may�sculas/min�sculas
        

        String traduccion = diccionario.get(palabraIngles);

        if (traduccion != null) {
            System.out.println("Traducci�n al espa�ol: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }

        scanner.close();
    }
}