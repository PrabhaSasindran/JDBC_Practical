package ThreadPackage;

public class DeadLockExample {
    public static void main(String[] args){
        thred t = new thred();
        t.help();
    }
}
class thred extends Thread{
    AA a = new AA();
    BB b = new BB();
    public void help(){
        this.start();
        b.m2(a);
    }
    @Override
    public void run() {
        a.m1(b);
    }
}
class AA{
    public synchronized void m1(BB b){
        System.out.println("AA class calling BB class tag2 method");
        b.tag2();
    }
    public synchronized void tag1(){
        System.out.println("tag1 method");
    }
}
class BB{
    public synchronized void m2(AA a){
        System.out.println("BB class is calling AA class tag1 method");
        a.tag1();
    }
    public synchronized void tag2(){
        System.out.println("tag2 method");

    }
}