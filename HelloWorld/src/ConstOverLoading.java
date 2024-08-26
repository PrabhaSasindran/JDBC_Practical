public class ConstOverLoading {
    public static void main(String[] args){
        ConstThree con = new ConstThree();
        ConstThree con1 = new ConstThree(10);
        ConstThree con2 = new ConstThree(100f);
        ConstThree con3 = new ConstThree(50,300f);
        ConstThree con4 = new ConstThree(200f,70);
    }
}
class ConstThree{
    public ConstThree(){
        System.out.println("no argument constructor");
    }
    public ConstThree(int a){
        System.out.println("integer one-argument constructor " +a);
    }
    public ConstThree(float b){
        System.out.println("float one-argument constructor " +b);
    }
    public ConstThree(int a, float b){
        System.out.println("Different length two-argument constructor " +a+"  "+b);
    }
    public ConstThree(float b, int a){
        System.out.println("Different order two-argument constructor " +b+"  "+a);
    }
}