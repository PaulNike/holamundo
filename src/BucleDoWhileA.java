import java.util.Scanner;

public class BucleDoWhileA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "java123";
        String claveIngresada;
        int intentos = 3;

        do {
            System.out.print("Ingrese clave: ");
            claveIngresada = sc.nextLine();
            intentos--;

            if (!claveIngresada.equals(claveCorrecta)) {
                System.out.println("Incorrecto. Intentos restantes: " + intentos);
            }

        } while (!claveIngresada.equals(claveCorrecta) && intentos > 0);

        if (claveIngresada.equals(claveCorrecta)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Cuenta bloqueada");
        }
    }
}
