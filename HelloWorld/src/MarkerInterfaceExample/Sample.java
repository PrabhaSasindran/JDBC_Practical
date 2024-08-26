package MarkerInterfaceExample;

public class Sample {
    public static void main(String[] args){
        A a = new A();
        if(a instanceof P){
            a.show();
        }else{
            System.out.println("no permission to call show method");
        }
    }
}
interface P{

}
class A implements P{
    public void show(){
        System.out.println("marker interface example");
    }
}