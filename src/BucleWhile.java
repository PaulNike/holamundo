import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int suma = 0;

        while (num != 0) {
            System.out.print("Ingrese número (0 para terminar): ");
            num = sc.nextInt();
            suma += num;
        }
        System.out.println("Suma total: " + suma);
    }
}
