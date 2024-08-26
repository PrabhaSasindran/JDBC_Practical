package Pack;

public class Operation {
    public static void main(String[] args){
        int a = 10; int b = 6;
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);

        System.out.println(b+a);
        System.out.println(a-b);

        if(a>9 || b>7){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }

        if(!(b>a)){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }
        System.out.println(a>b?"true":"false");
    }
}
