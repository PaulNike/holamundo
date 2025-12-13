import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scan.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scan.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años");

    }
}
