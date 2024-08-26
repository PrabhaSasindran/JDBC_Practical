package InterafceStaticPackOne;

public class Sample {
    public static void main(String[] args){
        A a = new A();
        a.show();
        I1.display();
    }
}
interface I1{
    void show();
    static void display(){
        System.out.println("Static method in interface");
    }
}
class A implements I1{

    @Override
    public void show() {
        System.out.println("abstract method in interface");
    }
}