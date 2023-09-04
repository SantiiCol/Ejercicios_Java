import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio8 {

	/*Crea un programa que permita a un profesor registrar las notas de sus estudiantes. Utiliza un HashMap donde 
	 * las claves sean los nombres de los estudiantes y los valores sean las notas correspondientes. 
	 * El programa debe permitir al profesor agregar estudiantes y asignar sus notas, así como también consultar 
	 * la nota de un estudiante específico.
	 */
	public static void main(String[] args) {
        Map<String, Double> registroNotas = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar estudiante y asignar nota");
            System.out.println("2. Consultar nota de estudiante");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de la entrada numérica

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la nota del estudiante: ");
                    double nota = scanner.nextDouble();
                    registroNotas.put(nombre, nota);
                    System.out.println("Estudiante y nota registrados exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del estudiante para consultar su nota: ");
                    String nombreConsulta = scanner.nextLine();
                    if (registroNotas.containsKey(nombreConsulta)) {
                        double notaConsultada = registroNotas.get(nombreConsulta);
                        System.out.println("La nota de " + nombreConsulta + " es: " + notaConsultada);
                    } else {
                        System.out.println("El estudiante no se encuentra en el registro.");
                    }
                    break;
                case 3:
                    System.out.println("¡Adiós!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

