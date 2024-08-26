public class CastingExample {
    public static void main(String[] args){
        BB b = new CC();
        System.out.println(b.i);
        b.m1();
        b.m2();
        CC c = (CC) b;
        System.out.println(c.i);
        System.out.println(c.j);
        c.m1();
        c.m2();
        c.m3();
    }
}
class BB{
    int i=10;
    public void m1(){
        System.out.println("generic");
    }
    public void m2(){
        System.out.println("overriden parent class");
    }
}
class CC extends BB{
    int j =20;
    public void m2(){
        System.out.println("overriden child class");
    }
    public void m3(){
        System.out.println("specific");
    }
}