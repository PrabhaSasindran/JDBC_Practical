public class ThisKeywordImplementation {
    public static void main(String[] args){
        new SampleTwo().add(100,500);
    }
}
class SampleTwo{
    int a;
    int b;
    public void add(int a, int b){
        this.a = a;
        this.b = b;
        display();
    }
    public void display(){
        System.out.println(a+"   "+b);
    }
}