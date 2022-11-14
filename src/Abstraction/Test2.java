package Abstraction;

//Abstraction example on real life scenario

abstract class Test2 {

    abstract void color();

}
class Red extends Test2{

    void color(){
        System.out.println("hello i'm in red class");
    }

}
class Blue extends Test2{

    @Override
    void color() {
        System.out.println("hello i'm in blue class");
    }
}
class TestAbstraction{
    public static void main(String[] args) {

        Test2 tx=new Red();
        tx.color();

        Test2 ty=new Blue();
        ty.color();
    }
}