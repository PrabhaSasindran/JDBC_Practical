package Pack;

public class BlocksSample {
    static{
        System.out.println("static block");
    }
    static{
        System.out.println("static 1");
    }
    {
        System.out.println(" non static block");
    }
    {
        System.out.println(" non static 1");
    }
    public static void main(String[] args){
        new BlocksSample();
        System.out.println(" main");
    }
    static {
        System.out.println("static 2");
    }
}
