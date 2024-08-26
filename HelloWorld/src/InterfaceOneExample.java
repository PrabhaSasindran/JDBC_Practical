public class InterfaceOneExample {
    public static void main(String[] args){
        CCI c = new CCI();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
    }
}
interface IOA{
    int j =10;
    void m1();
    void m2();
}
interface IOAA{
    void m3();
}
abstract class OD{
    public abstract void m4();
}
abstract class BBI extends OD implements IOA,IOAA{

    @Override
    public void m2() {
        System.out.println("Hi m2");
    }

    @Override
    public void m3() {
        System.out.println("Hi m3");
    }

    @Override
    public void m4() {
        System.out.println("Hi m4");
    }
}
class CCI extends BBI{

    @Override
    public void m1() {
        System.out.println("Hi m1");
    }
}