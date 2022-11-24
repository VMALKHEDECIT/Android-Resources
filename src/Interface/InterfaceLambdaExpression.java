package Interface;

interface HighSchool{

    public void students();

}
class JuniorSchool implements HighSchool{

    @Override
    public void students() {
        System.out.println("im in junior school");
    }
}
class Lkg implements HighSchool{

    @Override
    public void students() {
        System.out.println("im in lkg");
    }
}

public class InterfaceLambdaExpression {
    public static void main(String[] args) {

       // HighSchool h1=new JuniorSchool();
        // HighSchool h2=new Lkg();
           //  h1.students();
            //h2.students();

        HighSchool h1=()->{

            System.out.println("im in college");

        };
        h1.students();


    }
}
