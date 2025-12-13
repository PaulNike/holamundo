import java.util.Scanner;

public class SistemaCalificacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Nota examen 1: ");
        double e1 = sc.nextDouble();

        System.out.print("Nota examen 2: ");
        double e2 = sc.nextDouble();

        System.out.print("Nota trabajo final: ");
        double tf = sc.nextDouble();

        double promedio = (e1 * 0.30) + (e2 * 0.30) + (tf * 0.40);

        String estado = (promedio >= 11) ? "Aprobado" : "Desaprobado";

        String comentarioPrincipal =
                (edad < 18) ? "Alumno menor de edad, se recomienda acompañamiento."
                        : (promedio >= 11) ? "¡Felicitaciones!"
                        : "Debe reforzar sus estudios.";

        String comentarioExtra1 =
                (promedio >= 10 && promedio < 11)
                        ? "El alumno está a 1 punto o menos de aprobar."
                        : "";

        String comentarioExtra2 =
                (promedio <= 5)
                        ? "Rendimiento crítico."
                        : "";

        System.out.println("\n-------------------------------------");
        System.out.println("REPORTE ACADÉMICO");
        System.out.println("-------------------------------------");
        System.out.println("Nombre          : " + nombre);
        System.out.println("Edad            : " + edad);
        System.out.println("Promedio final  : " + promedio);
        System.out.println("Estado          : " + estado);
        System.out.println("Comentario      : " + comentarioPrincipal);
        System.out.println(comentarioExtra1);
        System.out.println(comentarioExtra2);
        System.out.println("-------------------------------------");

        sc.close();
    }
}
