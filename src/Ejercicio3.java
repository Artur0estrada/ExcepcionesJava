import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un índice para acceder al elemento: ");
            int indice = Integer.parseInt(scanner.nextLine());

            if (indice < 0 || indice >= array.length) {
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }

            int elemento = array[indice];
            System.out.println("Elemento en el índice " + indice + ": " + elemento);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
