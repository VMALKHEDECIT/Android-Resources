package Interface;

interface Business{
    public void money();

}
class macD implements Business{

    @Override
    public void money() {
        System.out.println("There is huge profit in the macD business");
    }
}
class pizzaHut implements Business{

    @Override
    public void money() {
        System.out.println("There is huge profit in the pizza hut business");
    }
}


public class InterfaceProgram2 {
    public static void main(String[] args) {

        Business b1=new macD();
        Business b2=new pizzaHut();
        b1.money();
        b1.money();
        b2.money();

    }
}
