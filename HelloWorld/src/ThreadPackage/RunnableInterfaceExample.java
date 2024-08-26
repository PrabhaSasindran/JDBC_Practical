package ThreadPackage;

public class RunnableInterfaceExample {
    public static void main(String[] args) throws InterruptedException {
      C c = new C();
      Thread t = new Thread(c);
      t.start();
      for (int i=1;i<=10;i++){
          Thread.sleep(500);
          System.out.println(i+" Parent Thread");
      }
    }
}
class C implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(500);
                System.out.println(i+" Child Thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}