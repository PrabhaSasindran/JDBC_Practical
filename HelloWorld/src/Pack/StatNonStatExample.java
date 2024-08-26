package Pack;

public class StatNonStatExample {
    static int a;
    int b;
    public static void main(String[] args){
        //a= 50;
        a= 10;

        StatNonStatExample snst = new StatNonStatExample();
        StatNonStatExample snst1 = new StatNonStatExample();
        StatNonStatExample snst2 = new StatNonStatExample();
        //System.out.println(a);
        //snst.b = 10;
        snst.b = 100;
        snst.a = 200;
        System.out.println(snst2.a);
        System.out.println(snst2.b);
        System.out.println(snst.b);
        snst2.b = 1000;
        System.out.println(snst1.b);
        System.out.println(snst2.b);

//        System.out.println(a);
//        System.out.println(snst.b);
//        System.out.println(snst1.a);
//        System.out.println(snst2.a);
//        snst1.b = 500;
//        System.out.println(snst2.b);
//        System.out.println(snst1.b);

    }
}
