package ThreadPackage;

public class SynchronizationExample {
    public static void main(String[] args){
       H h = new H();
       ThredSample t1 = new ThredSample(h,"Thread 1");
       ThredSample t2 = new ThredSample(h,"Thread 2");
       t1.start();
       t2.start();
    }
}
class ThredSample extends Thread{
    H h;
    String s;

    public ThredSample(H h, String s){
        this.h = h;
        this.s = s;
    }
    @Override
    public void run() {
        h.m1(s);
    }
}
class H{
    public synchronized void m1(String str){
        for(int i =1;i<=5;i++){
            try {
                Thread.sleep(250);
                System.out.println(str+"  "+ i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}