import java.util.*;

public class Vector_snippet {
    public static void main(String[] args) {

        Vector<String> v=new Vector<String>();//creating vector
        v.add("abcd");//method of Collection
        v.addElement("efgh");//method of Vector
        v.addElement("1234");
        //traversing elements using Enumeration
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }



    }
}
