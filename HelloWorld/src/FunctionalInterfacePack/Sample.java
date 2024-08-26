package FunctionalInterfacePack;

public class Sample {
    public static void main(String[] args){
        One o = new One();
        o.dispaly();
        o.show();
        A.add();
    }
}
@FunctionalInterface
interface A{
    void show();
    default void dispaly(){
        System.out.println("default method in interface");
    }
    static void add(){
        System.out.println("static method in interface");
    }
}
class One implements A{

    @Override
    public void show() {
        System.out.println("abstract method in interface");
    }

    @Override
    public void dispaly() {
        A.super.dispaly();
    }
}