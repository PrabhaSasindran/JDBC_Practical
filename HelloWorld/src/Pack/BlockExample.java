package Pack;

public class BlockExample {
    static int a;
    int b;
    static {
        a=29;
    }
    {
        b=40;
        a= 50;
    }
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(new BlockExample().b);
        System.out.println(new BlockExample().a);
        System.out.println(a);
    }
}
