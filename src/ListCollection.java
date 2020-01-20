import java.util.*;
public class ListCollection {
    public static void main(String[] args){
        List<String> list =new ArrayList<String>();
        list.add("ankur");
        list.add("prashant");
        list.add("vinayak");
        list.add("rajiv");
        list.add("ekta");
        list.add("vandna");
        System.out.println(list);



       /* Iterator itr =list.iterator();// traversing list through iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        */



       // another method to iterate the list elements
       for(String element : list)
       {
           System.out.println(element);
       }

       list.add(2,"omar");// insert the the element in a specified given index position
       list.add(3,"kaju");

       list.add("ankur");// append the element at the end
       System.out.println(list);
       // elements iterate in reverse order
        ListIterator<String>list1  =list.listIterator(list.size());
        while(list1.hasPrevious())
        {
            String str =list1.previous();
            System.out.println(str);
        }


        System.out.println("Traversing list through for loop:");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        List<String>list2 =new ArrayList<String>();
        list2.add("ankur");
        list2.add("vinayak");
        list.retainAll(list2);// find comman value from list1 and list2

        System.out.println(" retainAll value:"+list);
// isEmpty()
        System.out.println("IS ARRAY LIST EMPTY:"+list.isEmpty());
// set()-> updating an element at specific position

        list2.set(1,"prashant");
        System.out.println("after updating list2"+list2);
    }
}
