package Interface;

class School{

    int rollNo;
    String name;

    School(int rollNo,String name){

        this.rollNo=rollNo;
        this.name=name;

    }

}

class Student extends School{

     int marks;
    Student(int rollNo, String name,int marks) {
        super(rollNo, name);
        this.marks=marks;
    }
}

public class InterfaceProgram1 {
    public static void main(String[] args) {

        Student s1=new Student(01,"Akash",78);



    }
}
