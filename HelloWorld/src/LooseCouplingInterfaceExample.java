public class LooseCouplingInterfaceExample {
    public static void main(String[] args){
        LCA a = new LCA();
        a.display();
        a.show();
    }
}
interface I1{
    void show();
    void display();
}
class LCA implements I1{

    @Override
    public void show() {
        System.out.println("show hello");
    }

    @Override
    public void display() {
        System.out.println("display hello");
    }
}