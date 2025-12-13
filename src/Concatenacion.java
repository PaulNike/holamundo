public class Concatenacion {
    public static void main(String[] args) {
        // +

        //System.out.println("Resultado: " + 10 + 20);

        int edad = 20;

        //condicional
        if (edad >= 18){
            System.out.println("Si es mayor de edad");

        }else {
            System.out.println("NO es mayor de edad");

        }
        //condicion ? valorSiEsVerdadero : valorSiEsFalso

        String resultado = (edad >= 18) ? "EsMayor de edad" : "Es Menor de Edad";
        System.out.println("Ternario " + resultado);

    }
}
