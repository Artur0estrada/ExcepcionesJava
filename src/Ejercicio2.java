import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double n1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            double n2 = Double.parseDouble(scanner.nextLine());

            if (n2 == 0) {
                throw new ArithmeticException("No se puede dividir entre cero");
            }

            double r = n1 / n2;
            System.out.println("Resultado: " + r);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
