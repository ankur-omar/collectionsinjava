import java.util.*;
class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno =rollno;
        this.name =name;
        this.age =age;

    }
}

class ArrayList5 {
    public static  void main(String[] args){
        // creating userdefiend class object
        Student s1=new Student(101,"ankur",18);
        Student s2=new Student(102,"ritik",20);
        Student s3=new Student(103,"kartik",20);
        ArrayList<Student> al =new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        // iterate the ArrayList Object
        for(Student element :al)
        {
            System.out.println(element.rollno+" "+element.name+" "+element.age);
        }


    }
}
