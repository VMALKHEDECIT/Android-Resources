package ObjectAndClasses;

//Java Program to demonstrate having the main method in
//another class
//Creating Student class.
public class Student1{
    int id;
    String name;
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1{
    public static void main(String args[]){
        Student1 s1=new Student1();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}