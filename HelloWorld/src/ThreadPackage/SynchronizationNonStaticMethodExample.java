package ThreadPackage;

public class SynchronizationNonStaticMethodExample {
    public static void main(String[] args){
        ThredSampleTwo t1 = new ThredSampleTwo("Thread 1");
        ThredSampleTwo t2 = new ThredSampleTwo("Thread 2");
        t1.start();
        t2.start();
    }
}
class ThredSampleTwo extends Thread{
    String s;
    public ThredSampleTwo(String s){
        this.s = s;
    }
    @Override
    public void run() {
        L.m1(s);
    }
}
class L{
    public static synchronized void m1(String s){
        for(int i =1;i<=5;i++){
            try {
                Thread.sleep(250);
                System.out.println(s+"  "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}