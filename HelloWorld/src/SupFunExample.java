public class SupFunExample {
    public static void main(String[] args){
     new SupFunB();
    }
}
class SupFunA{
    public SupFunA(){
        System.out.println("no arg con parent");
    }
    public SupFunA(int a){
        this();
        System.out.println("one arg con parent");
    }
}
class SupFunB extends SupFunA{
    public SupFunB(){
        this(10);
        System.out.println("no arg con child");
    }
    public SupFunB(int a){
        super(100);
        System.out.println("one arg con child");
    }
}