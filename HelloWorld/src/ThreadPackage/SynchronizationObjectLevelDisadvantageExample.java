package ThreadPackage;

public class SynchronizationObjectLevelDisadvantageExample {
    public static void main(String[] args){
    K k1 = new K();
    K k2 = new K();
    ThredSampleOne t1 = new ThredSampleOne(k1,"Thread 1");
    ThredSampleOne t2 = new ThredSampleOne(k2,"Thread 2");
    t1.start();
    t2.start();
    }
}
class ThredSampleOne extends Thread{
    K k;
    String s;
    public ThredSampleOne(K k,String s){
        this.k = k;
        this.s = s;
    }
    @Override
    public void run() {
        k.m1(s);
    }
}
class K{
    public synchronized void m1(String s){
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