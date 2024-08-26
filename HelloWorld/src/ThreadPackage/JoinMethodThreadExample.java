package ThreadPackage;

public class JoinMethodThreadExample {
    public static void main(String[] args) throws InterruptedException {
        E e = new E();
        E.t = Thread.currentThread();
        e.start();
        for(int i=0;i<=10;i++){
            //e.join();
            Thread.sleep(500);
            System.out.println(i+"  Parent Thread");
        }
    }
}
class E extends Thread{
    static Thread t;
    @Override
    public void run()throws RuntimeException{
        for(int i=0;i<=10;i++){
            try {
                t.join();
                Thread.sleep(500);
                System.out.println(i+"  Child Thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}