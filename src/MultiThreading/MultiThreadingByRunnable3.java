package MultiThreading;

class JavaTest implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("java");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class AndroidTest implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("android");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class MultiThreadingByRunnable3 {
    public static void main(String[] args) {
        

    }
}
