package ExceptionPackOne;

public class ClassNotFoundExcepExample {
    public static void main(String[] args){
        try {
            Class.forName("ExceptionPackOne.ClassNotFoundExcepExample");
            System.out.println("class found successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class A{
    public void m1(){
        System.out.println("hi");
    }
}