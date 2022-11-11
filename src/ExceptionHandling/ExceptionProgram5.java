package ExceptionHandling;

public class ExceptionProgram5 {
    public static void main(String[] args) {

        try {
            int x=40/0;
            System.out.println(x);
        }
        catch (ArithmeticException e ){

            System.out.println(e);
        }
        finally {
            System.out.println("Always executes weather exception occurs or not");
        }


    }
}
