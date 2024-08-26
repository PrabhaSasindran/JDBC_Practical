package ThreadPackage;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();
        for(int i =1;i<=10;i++){
            Thread.sleep(500);
            System.out.println(i +" Parent Thread");
        }
    }
}
class A extends Thread{
    @Override
    public void run() {
        for (int i =1;i<=10;i++){
            try {
                Thread.sleep(500);
                System.out.println(i +" Child Thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}