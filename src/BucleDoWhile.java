import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println("Ejecutando al menos 1 vez");
            i--;
        }while (i > 0);

        // Menu Simple
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Saludar");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println("Holaaaa!!!");
            }
        }while (opcion != 0);

        // Validación de contraseña (Maximo 3 intentos)
        Scanner teclado = new Scanner(System.in);

        String claveCorrecta = "java123";
        String claveIngresada;

        int intentos = 3;

        do {
            System.out.print("Ingrese la clave: ");
            claveIngresada = teclado.nextLine();

            if (claveIngresada.equals(claveCorrecta)) {
                System.out.println("Acceso concedido");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Incorrecto. Intentos restantes: " + intentos);
                }
            }

        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Se acabaron los intentos. Cuenta bloqueada.");
        }

        teclado.close();
        //Ingresar la clave -> validar la clave -> SI ES CORRECTA : Imprimes Acceso concedido.
        //-> NO ES CORRECTA: Incorrecto, intentos restantes: valorDeIntentos;
        //-> Se acabaron los intentos : Imprimes cuenta bloqueada.

    }
}
