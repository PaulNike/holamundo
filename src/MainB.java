public class MainB {
    public static void main(String[] args) {

        //primitivos
        //ENTEROS
        byte edad2 = 127; //1bytes -> 8bits
        short edad3 = -32768; //2 bytes-> 16bits
        int edad = 2147483647; //4 bytes -> 32bits
        long numero = 9223372036854775807L; //8 bytes -> 64bits

        //REALES
        float dato = 15.5f; //4 bytes -> 32bits
        double dato2 = 1.7976931348623157E308; //8 bytes -> 64bits

        //Caracter
        char dato3 = 'A'; // 2bytes -> (16bits)

        //BOOLEANOS

        boolean activo = true; // 1bit
        boolean inactivo = false; // 1bit

        //NO ES PRIMITIVIO
        String nombre = "Paul";



        System.out.println("Hello world!");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.print("Valor: " + dato2);

    }


}
