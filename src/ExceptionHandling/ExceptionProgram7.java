package ExceptionHandling;

public class ExceptionProgram7 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=10;i++)
        {
            Thread.sleep(500);
            System.out.println(i);
        }

    }
}
