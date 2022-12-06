package MultiThreading;

class bike implements Runnable{

    @Override
    public void run() {
        System.out.println("im running in bike class");
    }
}

public class ThreadByUsingRunnable {
    public static void main(String[] args) {

        bike b1=new bike();
        Thread t1=new Thread(b1);
        t1.start();

    }
}
