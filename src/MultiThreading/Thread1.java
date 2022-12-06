package MultiThreading;

class Mobile extends Thread{

    public void run(){
        System.out.println("im in mobile class");
    }
}

public class Thread1 {
    public static void main(String[] args) {

        Mobile m1=new Mobile();
        m1.run();

    }
}
