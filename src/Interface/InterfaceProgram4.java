package Interface;

interface Car{
    public void model();
}
class bmw implements Car{

    @Override
    public void model() {
        System.out.println("This is bmw x6 model");
    }
}
class jaguar implements Car{

    @Override
    public void model() {
        System.out.println("This is jaguar xjl model");
    }
}

public class InterfaceProgram4 {

    public void mercedes(Car c){

        c.model();
    }

    public static void main(String[] args) {

        InterfaceProgram4 i4=new InterfaceProgram4();

        i4.mercedes(new bmw());
        i4.mercedes(new jaguar());

        i4.mercedes(new Car() {
            @Override
            public void model() {
                System.out.println("This is mercedes amg e63");
            }
        });

    }
}
