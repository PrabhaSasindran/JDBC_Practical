package ThreadPackage;

public class SetNamePriorityThreadExample {
    public static void main(String[] args){
        D d = new D();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(d.getName());
        System.out.println(d.getPriority());
        Thread.currentThread().setName("Parent Thread");
        Thread.currentThread().setPriority(9);
        d.setName("Child Thread");
        d.setPriority(7);
        System.out.println("=====================================================");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(d.getName());
        System.out.println(d.getPriority());
        d.start();
    }
}
class D extends Thread{
    @Override
    public void run() {
        System.out.println("hi");
    }
}