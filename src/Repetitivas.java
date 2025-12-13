import java.util.Scanner;

public class Repetitivas {
    public static void main(String[] args) {
        //Sin Bucle
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("============CON BUCLE=============");

        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        // 0 -> 4
        // 1 -> 8
        // 2 -> 12
        // 3 -> 10
        int[] numeros = {4,8,12,10};
        int suma = 0;
        for (int j=0; j < numeros.length; j++){
            suma += numeros[j];
        }
        System.out.println("Suma Total: " + suma);

        //EJERCICO ALUMNOS
        //Buscar el numero mayor en un arreglo:
        int[] valores = {500,8,40,22,100};
        int mayor = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }
        System.out.println("Mayor: " + mayor);

        //WHILE
        System.out.println("===================WHILE===============");
        int p = 10;
        while (p > 0){
            System.out.println(p);
            p--;
        }

        //Ingresa un numero positivo
        Scanner sc = new Scanner(System.in);
        int n = -1;

        while (n < 0){
            System.out.println("Ingrese un numero positivo: ");
            n = sc.nextInt();
        }

        System.out.println("Correcto: " + n);

        //Sumar numero hasta que el usuario escriba el 0




    }
}
