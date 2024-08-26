package InterfaceDefaultPack;

public class Sample {
    public static void main(String[] args){
        A a = new A();
        a.show();
        a.display();
    }
}
interface I1{
    void show();
    default void display(){
        System.out.println("default method in interface");
    }
}
class A implements I1{

    @Override
    public void show() {
        System.out.println("implemented abstract method of interface");
    }

    @Override
    public void display() {
       //I1.super.display();
         System.out.println("overrided default method from interface");
    }
}