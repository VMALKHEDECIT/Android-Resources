package MultiThreading;

class Java implements Runnable{

    @Override
    public void run() {
       for (int i=1;i<=5;i++){
           System.out.println("java");
       }
    }
}
class Android implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("android");
        }

    }
}

public class ThreadByRunnable2 {
    public static void main(String[] args) {

        Runnable r1=new Java();
        Runnable r2=new Android();

        Thread t1=new Thread(r1);
        t1.start();
        Thread t2=new Thread(r2);
        t2.start();

    }
}
