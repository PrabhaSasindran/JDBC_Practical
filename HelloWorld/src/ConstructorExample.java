public class ConstructorExample {
    public static void main(String[] args){
        ConstOne con = new ConstOne();
        ConstOne con1 = new ConstOne(10);

    }
}
class ConstOne{

    public ConstOne(){
        System.out.println("No argument constructor");
    }

    public ConstOne(int a){
        System.out.println("parameterized constructor" + a);
    }
}