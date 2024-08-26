package ExceptionPack;

public class ClassCastExcepExample {
    public static void main(String[] args){
        System.out.println("main start");
      A a = new B();
      try {
          C c = (C) a;
      }catch (ClassCastException e){
          e.printStackTrace();
      }
        System.out.println("main end");
    }

}
class A{

}
class B extends A{

}
class C extends A{

}