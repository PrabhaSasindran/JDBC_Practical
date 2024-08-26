public class MethodOverloadingExample {
    public static void main(String[] args){
        Sample.add();
        Sample.add(30);
        Sample.add(20,60);
    }
}
class Sample{
    public static void add(){
        System.out.println(10+20);
    }
    public static void add(int a){
        System.out.println(a+a);
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }
}