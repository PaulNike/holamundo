import java.util.Scanner;

public class BasicArrays {
    public static void main(String[] args) {
        int[] numeros = {5,10,15,20,25};

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento en posicion "
                    + i + " : " + numeros[i]);
        }
        /**================EJERCICIO 2=======================*/
        /*NOTA: ESTAS REUTILIZANDO EL ARRAY numeros*/
        int suma = 0;
        for (int j = 0; j < numeros.length;j++){
            suma += numeros[j];
        }
        System.out.println("La suma total es: " + suma);

        /**================EJERCICIO 3=======================*/

        int[] numbers = {1,4,5,10,13,16,19,22,25,28};
        int pares =0;
        int impares =0;
        for (int k = 0; k < numbers.length; k++){
            if(numbers[k] %2 == 0){
                pares++;
            }else {
                impares++;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);

        /**================EJERCICIO 4=======================*/
        int[] nums = {1,3,3,7,9,8,5,2,5};
        for (int x = 0; x < nums.length; x++){
            boolean repetido = false;
            for (int y = x + 1; y < nums.length; y++){
                if (nums[x] == nums[y]){
                    repetido=true;
                }
            }
            if (repetido){
                System.out.println("Numero repetido: " + nums[x]);
            }
        }

        /**================EJERCICIO 5=======================*/

        String[] nombres = {"Ana", "Nike", "Bryan", "Favio", "Jean"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre a buscar: ");
        String nombreBuscado = sc.nextLine();

        boolean encontrado = false;
        int posicion = -1;

        for (int e=0; e < nombres.length; e++){
            if(nombres[e].equalsIgnoreCase(nombreBuscado)){
                encontrado = true;
                posicion = e;
                break;
            }
        }
        if (encontrado){
            System.out.println("Nombre encontrado en la posicion :" + posicion);
        }else {
            System.out.println("Nombre no encontrado");
        }

        /**================EJERCICIO 5=======================*/

        int catn = 0;
        int cat =0;
        //char[] vocales = {'p', 'r', 'o', 'g', 'r', '1', 'c', 'i', 'o', 'n'};

        char[] letras = {'p','r','o','g','r','A','m','A','c','1','o','n'};
        // imprimir cantidad de vocales y cantidad de consonantes
        int vocales=0;
        int consonantes=0;
        char letr;

        for (int j=0; j<letras.length; j++) {
            letr = letras[j];

            if(letr >= 'a' && letr <='z')
            if (Character.isLetter(letras[j])) {
                letr = Character.toLowerCase(letras[j]);
                if (letr == 'a' || letr == 'e' || letr == 'i' || letr == 'o' || letr == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("Vocales:" + vocales);
        System.out.println("Consonantes:" + consonantes);
    }
}
