public class ConstThisExample {
    public static void main(String[] args){
        ConstTwo con = new ConstTwo(80, 120);

    }
}
class ConstTwo{
    int a;
    int b;

    public ConstTwo(int a, int b){
        this.a = a;
        this.b = b;
        display();
        //System.out.println(a+"  "+b);
    }

    public void display(){
        System.out.println(a+"   "+b);
    }
}