                   // suresh sir class linked list
                   //Data structure using java linked list
                   // in operating system the use of linked list is for file allocation system
import java.util.*;
import java.util.Iterator;

public class LinkedListCollection {
    public static void main(String[] args)
    {
        // create an empty linked list

        LinkedList<String> l_list =new LinkedList<String>();
        // use add method to add element in the linkedlist
        l_list.add("red");
        l_list.add("green");
        l_list.add("black");
        l_list.add("white");
        l_list.add("Pink");
        l_list.add("Yellow");
        // print the list
        System.out.println("Linked list:" +l_list);

        // iterate or access the value one by one in linked list
        for(String e:l_list)
        {
            System.out.println(e);
        }
        // iterating the elem,ent with specified number
// set iterator at specified index
        Iterator p =l_list.listIterator(1);
        while(p.hasNext()){// print list from second position
            System.out.println(p.next());
        }

        // iterating the linked list in reverse order
        System.out.println("Linked list:" +l_list);
        Iterator it =l_list.descendingIterator();
        // print elements in reverse order
        while(it.hasNext()) {
            System.out.println(" reverse Linked list:" + it.next());

        }



    }
}
