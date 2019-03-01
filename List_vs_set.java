import java.util.*;
public class List_vs_set {
    public static void main(String[] args) {
        List<String> ll = new LinkedList();
        ll.add("Kevin");
        ll.add("Peter");
        ll.add("Kate");
        ll.add("Kevin");

        System.out.println("\nList Elements: ");
        System.out.print(ll);
        Set<String> hset = new HashSet();

                hset.add("Kevin");
                hset.add("Peter");
                hset.add("Kate");
                hset.add("Kate");
        System.out.println("\nSet Elements: ");
            System.out.println(hset);


    }
}
