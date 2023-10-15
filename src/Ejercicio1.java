import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(x.nextLine());

            if (edad <= 0) {
                throw new IllegalArgumentException("La edad debe ser mayor que 0");
            }

            System.out.println("Edad: " + edad);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese una edad valida");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
