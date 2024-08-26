package AbstarctPack;

public class AbstractSample {
    public static void main(String[] args){
        C c = new C();
        c.m1();
        c.m2();
        System.out.println(c.i+" non static data member");
        System.out.println(B.j+" static data member");
        c.add();
        System.out.println(c.l+" non static final data member");
        System.out.println(B.k+" static final data member");
        c.adds();
        B.show();
        c.displayInmpl();
    }
}
