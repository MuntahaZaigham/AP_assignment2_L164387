import java.util.*;
public class Array_list_snippet{

    public static void main(String[] args) {



                //creating array list
                List<String> al= new ArrayList<String>();
                 //adding object in array list
                al.add("first");
                al.add("second");
                al.add("third");
                al.add("fourth");
                al.add("fifth");
                al.add("sixth");
                al.add("seventh");
                //traversing elements using Iterator
                Iterator itr=al.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }




    }
}
