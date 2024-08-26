public class MethodOverloadingOneExample {
    public static void main(String[] args){
        MA.add(10d,'g');
    }
}
class MA{
    public static void add(int a){
        System.out.println(a+a);
    }
    public static void add(float a){
        System.out.println(a+a);
    }
    public static void add(double d){
        System.out.println(d+d);
    }
    public static void add(int a,float f){
        System.out.println(f);
        System.out.println(a+a);
    }
    public static void add(float a,double d){
        System.out.println(d);
        System.out.println(a+a);
    }
    public static void add(double d, char c){
        System.out.println(c);
        System.out.println(d+d);

    }

}