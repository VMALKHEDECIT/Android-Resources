package Abstraction;

//Simple Example of abstract class

abstract class Test1 {

    abstract void eat();
}

class  Animal extends Test1{

    void eat() {

        System.out.println("Eating Food");
    }


    public static void main(String[] args) {

        Test1 T = new  Animal();

        T.eat();

    }

}
