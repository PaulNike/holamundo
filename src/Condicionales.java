import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        //Ejemplo IF
        int numero = 9;

        if(numero > 10){
            System.out.println("El numero es mayor a 10");
        }

        // validar si un estduiante aprobo
        double nota = 11;

        if (nota >= 11){
            System.out.println("Aprobado");
        }

        //Verificar si un numero esta dentro de una rango
        int edad = 31;

        if (edad >= 18 && edad <= 30){
            System.out.println("Edad dentro del rango permitido");
        }

        //Validar si un cliente califica a un prestamo
        double ingresos = 3200;
        boolean tieneDeuda = false;
        int aniosTrabajo = 2;
        int age = 21;

        boolean califica = true;

        if (ingresos <= 2500){
            califica = false;
        }

        if (tieneDeuda == true){
            califica = false;
        }
        if (aniosTrabajo < 2){
            califica = false;
        }
        if (age < 21 || age > 65){
            califica = false;
        }

        if (califica){
            System.out.println("Cliente APTO para prestamo");
        }
        if (!califica){
            System.out.println("Cliente NO APTO");
        }

        //Dado un  puntaje de 0 a 100, clasificarlo en uno de
        // los siguientes rangos:
        /*
        * 0 a 20 -> Muy Bajo
        * 21 a 50 -> Bajo
        * 51 a 80 -> Medio
        * 81 a 100 -> Alto
        * Fuera de rango -> Puntaje invalido
        *
        * Imprimir: Rango: Medio | Alto | Muy bajo | Bajo | Invalido */

        int puntaje = 100;

        if(puntaje < 0 || puntaje > 100){
            System.out.println("Puntaje invalido");
        }
        if (puntaje >= 0 && puntaje <= 20){
            System.out.println("Rango: Muy Bajo");
        }
        if (puntaje >= 21 && puntaje <= 50){
            System.out.println("Rango: Bajo");
        }
        if (puntaje >= 51 && puntaje <= 80){
            System.out.println("Rango: Medio");
        }
        if (puntaje >= 81 && puntaje <= 100){
            System.out.println("Rango: Alto");
        }

        //ELSE
        int num = 9;

        if(num > 10){
            System.out.println("El numero es mayor a 10");
        }else {
            System.out.println("El numero NO es mayor a 10");
        }

        //ELSE - IF
        int note = 8;

        if (note >= 18) {
            System.out.println("Excelente");
        } else if (note >= 14) {
            System.out.println("Bueno");
        } else if (note >= 12) {
            System.out.println("No tan Bueno");
        } else if (note >= 10) {
            System.out.println("Eres Malo");
        }else {
            System.out.println("Necesita mejorar");
        }

        // SWITCH
        int dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro día");
        }

        //SWITCH
        Scanner scanner = new Scanner(System.in);
        String producto = scanner.nextLine();
        int stock = 2;

        switch (producto.trim().toUpperCase()){
            case "BEBIDA":
                if(stock > 10){
                    System.out.println("Stock Alto");
                } else if (stock >= 5 && stock <=10) {
                    System.out.println("Stock MOderado");
                }else {
                    System.out.println("Stock Bajo");
                }
                break;
            case "POSTRE":
                if (stock < 3){
                    System.out.println("Necesita Reposicion");
                }
                break;
            default:
                System.out.println("Producto No Registrado");
        }

        //POSTRE - postre - Postre - PoStRe
        /*
        un Sistema de transporte cobra una tarifa segun
                Tipo de ruta:
                Corto -> 3.00
                Medio -> 5.00
                Largo -> 8.00

                 Reglas:
                1. Si el pasajero es estudiante -> 20% de descuento
                2. Si es adulto mayor (mayor o igual de 60 años) -> 30% descuento
                3. Sino pertenece a ninguno paga normal

                Adicional
                1. Si el tipo de Ruta no existe -> Mensaje de error
                2. Si la edad es menor a 0 -> Mensaje Error
                3. Solo se aplica un descuento, el mayor

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("==== TIPOS DE RUTA ===");
        System.out.println("1. Corto (S/ 3.00)");
        System.out.println("2. Medio (S/ 5.00)");
        System.out.println("3. Largo (S/ 8.00)");
        System.out.println("Seleccione una ruta: ");
        int ruta = sc.nextInt();

        System.out.println("Ingrese su edad:");
        int edadPasajero = sc.nextInt();

        System.out.println("¿Es estudiante?: (true/false)");
        boolean estuidiante = sc.nextBoolean();
    }

}
