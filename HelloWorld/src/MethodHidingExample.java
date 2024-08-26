public class MethodHidingExample {
    public static void main(String[] args){
        HB b = new HC();
        b.m1();
    }
}
class HB{
    public static void m1(){
        System.out.println("parent class");
    }
}
class HC extends HB{
    public static void m1(){
        System.out.println("child class");
    }
}

//class HB{
//    public void m1(){
//        System.out.println("parent class");
//    }
//}
//class HC extends HB{
//    public void m1(){
//        System.out.println("child class");
//    }
//}