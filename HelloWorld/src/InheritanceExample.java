public class InheritanceExample {
    public static void main(String[] args){
        B b = new B();
        b.show();
        b.display();
    }
}
class A{
    public void display(){
        System.out.println("Parent class");
    }
}
class B extends A{
    public void show(){
        System.out.println("Child class");
    }
}