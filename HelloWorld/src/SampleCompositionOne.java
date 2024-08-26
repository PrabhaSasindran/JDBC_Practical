public class SampleCompositionOne {
    public static void main(String[] args){
        Two t = new Two();
        One o = new One(t);
    }
}
class One{
    Two two;
    public One(Two two){
        this.two=two;
        display();
    }
    public void display(){
        two.m1();
    }
}
class Two{
    public void m1(){
        System.out.println("haiii");
    }
}