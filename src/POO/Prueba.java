package POO;

public class Prueba {
    public static void main(String[] args) {

        //Creando un objeto sin datos iniciaes, los valores los asignaras despues
        Empleado empleado1 = new Empleado();
        //Asignación de valores
        empleado1.nombre = "Nike Rodriguez";
        empleado1.salario = 1130;
        empleado1.edad = 29;

        //Creando un objeto con los datos inciales
        Empleado empleado2 = new Empleado("Paul",29,1130);

        empleado1.mostrarInfo();
        empleado2.mostrarInfo();

        //USANDO LA CLASE ENCAPSULADA
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Favio Sifuentes");
        alumno1.setEdad(20);
        alumno1.setNota(11.4);

        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getEdad());
        System.out.println(alumno1.getNota());

        System.out.println(alumno1.toString());

        //Abstraccion y polimorfismo
        Animal animal;
        animal = new Perro();
        animal.hacerSonido();

        Animal animal2;
        animal2 = new Gato();
        animal2.hacerSonido();

        //herencia
        System.out.println("----------------------------------");
        Estudiante estudiante = new Estudiante();
        //estudiante.nombre = "Nike";
        //estudiante.edad = 29;
        estudiante.setNombre("Nike");
        estudiante.setEdad(29);
        estudiante.setNota(20);

        estudiante.mostrarDatos();
        System.out.println("Nota: " + estudiante.getNota());

        System.out.println("----------------v3------------------");
        Persona persona;
        persona = new Estudiante();
        persona.setNombre("Bryan");
        persona.setEdad(29);
        persona.mostrarDatos();
    }
}
