package ThreadPackage;

public class DeamonThreadExample {
    public static void main(String[] args) throws InterruptedException {
        F f = new F();
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(f.isDaemon());
        f.setDaemon(true);
        System.out.println(f.isDaemon());
        f.start();
        for(int i =1;i<=5;i++){
            Thread.sleep(500);
            System.out.println("Parent Thread "+i);
        }
    }
}
class F extends Thread{
    @Override
    public void run() {
        for(int i =1;i<=10;i++){
            try {
                Thread.sleep(500);
                System.out.println("Child Thread "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}