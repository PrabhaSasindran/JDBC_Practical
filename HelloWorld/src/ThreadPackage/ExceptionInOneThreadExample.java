package ThreadPackage;

public class ExceptionInOneThreadExample {
    public static void main(String[] args) throws InterruptedException {
        B b = new B();
        b.start();
        for(int i =1;i<=10;i++){
            Thread.sleep(500);
            System.out.println(i+" Parent thread");
        }
    }
}
class B extends Thread{
    @Override
    public void run() {
        for (int i =1;i<=10;i++){
            try {
                Thread.sleep(500);
                if(i==5){
                    System.out.println(10/0);
                }
                System.out.println(i+" Child thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}