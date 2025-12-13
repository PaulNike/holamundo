public class BucleForEach {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Jordy", "Jean Pierre"};

        for(String n: nombres){
            System.out.println(n);
        }

        //Recorrer un arreglo d enombre y mostrar solo
        // los que empiezan con una letra especifica
        String[] artistas = {"Adele", "Artic Monkeys", "Faraon", "Bruno Mars", "Avicii"};

        System.out.println("Artistas que empeicen con la Letra: B");
        for (String artista : artistas){
            if (artista.startsWith("B")){
                System.out.println(artista);
            }
        }


    }
}
