package ExceptionHandling;

public class ExceptionProgram2 {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());

        }
        catch (NullPointerException n){
            System.out.println(n);

        }
       System.out.println("Remaining code");
    }
}
