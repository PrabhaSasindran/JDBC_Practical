package ExceptionPackOne;

public class ExceptionPropagationExample {
    public static void main(String[] args){
        System.out.println("main start");
        try{
            new B().show();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
class B{
    public void show() throws ClassNotFoundException{
        Class.forName("B");
        System.out.println("inside function");

    }
}