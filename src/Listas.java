import java.util.*;

public class Listas {

    public static void main(String[] args) {

        int n= 100_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < n; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        //arrayList
        long inicioArray = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            arrayList.get(i);
        }
        long finArray = System.currentTimeMillis();

        //linkedList
        long inicioLinked = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            linkedList.get(i);
        }
        long finLinked = System.currentTimeMillis();

        System.out.println("ArrayList get(i): " + (finArray - inicioArray) + "ms");
        System.out.println("LinkedList get(i): " + (finLinked - inicioLinked) + "ms");


        Vector<String> names = new Vector<>();

        names.add("Paul");
        names.add("Nike");

        System.out.println(names);

        //SET
        Set<String> hasset = new HashSet<>();
        hasset.add("java");
        hasset.add("python");
        hasset.add("c++");
        hasset.add("java");

        System.out.println(hasset);
        //imprimiendo
        System.out.println(hasset.contains("java"));
        for (String lenguajes: hasset){
            System.out.println(lenguajes);
        }

        //SET
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("java");
        linkedHashSet.add("python");
        linkedHashSet.add("c++");
        linkedHashSet.add("java");

        System.out.println(linkedHashSet);

        //SET
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("java");
        treeSet.add("python");
        treeSet.add("c++");
        treeSet.add("java");

        System.out.println(treeSet);

    }
}
