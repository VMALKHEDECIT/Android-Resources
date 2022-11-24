package Interface;

interface Bank{

    public void rateOfInterest();

}
class hdfc implements Bank{

    @Override
    public void rateOfInterest() {
        System.out.println("Rate of Interest is 8%");
    }
}
class sbi implements Bank{

    @Override
    public void rateOfInterest() {
        System.out.println("Rate of Interest is 10%");
    }
}

public class InterfaceProgram3 {

    public void applyLoan(Bank bank){
        bank.rateOfInterest();
    }

    public static void main(String[] args) {

       InterfaceProgram3 i3=new InterfaceProgram3();
       i3.applyLoan(new hdfc());
       i3.applyLoan(new sbi());

       i3.applyLoan(new Bank() {
           @Override
           public void rateOfInterest() {
               System.out.println("Axis bank rate of interest is 12%");
           }
       });

    }
}
