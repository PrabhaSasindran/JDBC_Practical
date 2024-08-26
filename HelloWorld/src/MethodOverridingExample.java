public class MethodOverridingExample {
    public static void main(String[] args){
//        Child c = new Child();
//        c.m1();
//        c.m2();
//        c.m3();
        new Child().m1();
    }
}
class Parent{
    public void m1(){
        System.out.println("Parent property");
    }
    public void m2(){
        System.out.println("parent m2");
    }
    public void m3(){
        System.out.println("parent m3");
    }
}

class Child extends Parent{
    @Override
    public void m1(){
        System.out.println("Child property");
    }
    @Override
    public void m2(){
        System.out.println("m2 implementation");
    }
}