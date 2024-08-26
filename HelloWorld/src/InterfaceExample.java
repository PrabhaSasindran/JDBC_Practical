public class InterfaceExample {
    public static void main(String[] args){
        IA a = new IA();
        a.m1();
        a.m2();
        a.m3();
    }
}
interface In1{
    public static final int i = 100;
    public abstract void m1();
    public abstract void m2();
}
interface In2{
    void m3();
}
class IA implements In1,In2{

    @Override
    public void m1() {
        System.out.println("Interface 1, method 1");
    }

    @Override
    public void m2() {
        System.out.println("interface 1 method 2");
    }

    @Override
    public void m3() {
        System.out.println("interface 2 method 3");
        System.out.println("variable declared in interface "+i);
    }
}