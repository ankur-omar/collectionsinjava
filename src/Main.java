// suresh sir class java collection framework

import java.util.*;//connect the collection framework with java.
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        List<String> list_Strings =new ArrayList<String>();// here list_string is a list of Object
        list_Strings.add("Red");// by using add method we insert the value in list
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);// print the complete array without the help of loop.



        // time complexity of this method is o(1).
        //time complexiry of collection framework is o(1),o(n),o(nlogn).


        // insert an element in to the array list at the first
        list_Strings.add(0,"Pink");
        list_Strings.add(5,"Yellow");
        System.out.println(list_Strings);



        //iterating through all elements in an array.

        for(String element : list_Strings){   // for each element of list_Strings
            System.out.println(element);
        }



        // retrieve the element at speciefied position from the array list.
        String element = list_Strings.get(0);
        System.out.println("First element:"+element);
        element = list_Strings.get(2);
        System.out.println("Third element:"+element);



        // update specific element in array list.
        list_Strings.set(2,"Yellow");
        System.out.println(list_Strings);



        //remove the element in array list.
        list_Strings.remove(2);
        System.out.println(" after removing third element from the list:\n"+list_Strings);



        // search an element in a array list.
        if(list_Strings.contains("Red"))  // here contains is a method to search a element in a aaray list.
        {
            System.out.println("Found the elements");
        }
        else{
            System.out.println("There is no such element");
        }




        //sort a given array list.

        System.out.println("List before sort:"+list_Strings);
        Collections.sort(list_Strings);// here we Collections.sort() method to sort the array list.
        System.out.println("List after sort:"+list_Strings);


        //copy one array list into another.
        // number of element must be same in both the array list.

        List<String>List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");

        System.out.println("List1:"+List1);


        List<String>List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");

        System.out.println("List2:"+List2);
        Collections.copy(List1,List2);
        System.out.println("Copy List2 to  List1,\n after copy:");
        System.out.println("List1:"+List1);
        System.out.println("List2:"+List2);


        // shuffle method in array list
        Collections.shuffle(list_Strings);
        System.out.println("list after shuffling :\n"+list_Strings);



        // reverse array element in an array
        System.out.println("list_String is:\n"+list_Strings);
        Collections.reverse(list_Strings);
        System.out.println(" after reverse the list list_String is:\n"+list_Strings);




        // extract a portion of array list
        System.out.println("after extracting list_Strings");
        List<String> sub_List =list_Strings.subList(0,3);
        System.out.println("List of first three elements:"+sub_List);


        // compare two array list
        // element present any where in second list the order does not matter
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("red");
        l1.add("black");
        l1.add("orange");
        l1.add("pink");
        l1.add("green");


        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("red");
        l2.add("black");
        l2.add("white");
        l2.add("pink");
        l2.add("brown");

// storing the comparison output in Arraylist<String>
        ArrayList<String> l3 = new ArrayList<String>();
        for(String e:l1){
            l3.add(l2.contains(e)? "Yes":"No");

        }

        System.out.println("comparison output is:");
        System.out.println(l3);


// write a java program to swap two elements of arraylist
        System.out.println("before swap the array list:"+l1);
        Collections.swap(l1,0,2);
        System.out.println("after swaping the two elements of list l1 is:\n"+l1);

// join two array list

System.out.println("join two array list:---");
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("red");
        c1.add("black");
        c1.add("orange");
        c1.add("pink");
        c1.add("green");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("red");
        c2.add("black");
        c2.add("orange");
        c2.add("pink");
        c2.add("green");

        ArrayList<String> c3 = new ArrayList<String>();
        c3.addAll(c1);
        c3.addAll(c2);
        System.out.println("new array is:"+c3);

        // clone or duplicate array list in to a second list


        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("red");
        a1.add("black");
        a1.add("orange");
        a1.add("pink");
        a1.add("green");
        System.out.println("before clone the array:-"+a1);
        ArrayList<String> newa1 =  (ArrayList<String>)a1.clone();// type casting
        System.out.println("after clone the array:-"+newa1);


        // empty an array list
        System.out.println("empty the array list:-");
        ArrayList<String> b1 = new ArrayList<String>();
        b1.add("ankur");
        b1.add("vina");
        b1.add("raj");
        b1.add("pra");
        b1.add("ekka");

        System.out.println("before remove the array list to check empty or not\n" +b1.isEmpty());
        System.out.println("before  the array list:-"+b1);
        b1.removeAll(b1);
        System.out.println("after   the array list:-"+b1);
        System.out.println("after remove the array list to check empty or not\n" +b1.isEmpty());

// how to increase the size of an array list

        ArrayList<String> d1 = new ArrayList<String>();
        d1.add("ankur");
        d1.add("vina");
        d1.add("raj");
        System.out.println("new array list before increasing the size"   +d1);
        // increase capacity to 6;
        d1.ensureCapacity(6);
        d1.add("omar");
        d1.add("krishna");
        d1.add("helal");
        System.out.println("new array list after increasing the size"   +d1);



        // replace the second element with the specified element

        ArrayList<String> d2 = new ArrayList<String>();
        d2.add("ankur");
        d2.add("vina");
        d2.add("raj");
        System.out.println("new array list"   +d2);
        d2.set(0,"raj");
        System.out.println("new array list after replacing"   +d2);

        // program print the array element with index number

        ArrayList<String> d3 = new ArrayList<String>();
        d3.add("ankur");
        d3.add("vina");
        d3.add("raj");
        int s =d3.size();
        for(int i=0;i<s;i++)
        {
            System.out.println("\n"+i+" "+d3.get(i));

        }

    }
}

