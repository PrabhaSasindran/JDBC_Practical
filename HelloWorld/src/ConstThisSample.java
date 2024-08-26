public class ConstThisSample {
    public static void main(String[] args){
        AA a = new AA(10);

    }
}
class AA{
    public AA(){
        this(20,30);
        System.out.println("no-arg constructor");
    }

    public AA(int a){
        this();
        System.out.println("In one-arg constructor");
    }

    public AA(int a, int b){
        System.out.println("two-arg constructor");
    }
}