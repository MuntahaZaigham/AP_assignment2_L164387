import java.util.*;
public class hashset_vs_sortedset {
    public static void main(String[] args) {
        HashSet<String> HashFruits= new HashSet();

        SortedSet<String>  TreeFruits = new TreeSet();

        //inserting elements in hash set
        HashFruits.add("mango");
        HashFruits.add("apple");
        HashFruits.add("orange");
        HashFruits.add("pineapple");
        HashFruits.add("pineapple");


        //inserting elements in sorted set-> tree set
        TreeFruits.add("mango");
        TreeFruits.add("apple");
        TreeFruits.add("orange");
        TreeFruits.add("pineapple");
        TreeFruits.add("pineapple");


        //no ordering in HashSet – elements stored in random order
        System.out.println("Ordering in HashSet :" + HashFruits);

        //should be sorted order – TreeSet stores element in sorted order
        System.out.println("Order of objects in TreeSet :" + TreeFruits);


        //Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet
        HashSet<Integer> numbers = new HashSet<Integer>();
        long startTime = System.nanoTime();
        for(int i =0; i<1000000; i++){
            numbers.add(i);
        }

        long endTime = System.nanoTime();
        System.out.println("Total time to insert 10M elements in HashSet in sec : "
                + (endTime - startTime));


        // TreeSet performance Test – inserting 10M objects
        SortedSet<Integer> number = new TreeSet<Integer>();
        startTime = System.nanoTime();
        for(int i =0; i<1000000; i++){
            number.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total time to insert 10M elements in TreeSet in sec : "
                + (endTime - startTime));






    }
    }
