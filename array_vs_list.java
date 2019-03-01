
import java.util.*;

public class array_vs_list {
    public static void main(String[] args) {
        //working of list
    List<Integer> list=new ArrayList(4);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println("array list when initial capacity== elements added"+list);
    list.add(5);
    System.out.println("array list when initial capacity< elements added"+list);
        //working of array

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //throws exception if arr[3]=any value

        System.out.println("array  when initial capacity== elements added : "+arr[0]+" , "+arr[1]+" , "+arr[2]);



    }
}
