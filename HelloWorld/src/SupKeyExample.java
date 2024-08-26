public class SupKeyExample {
    public static void main(String[] args){
        new supB().m1();
    }
}
class supA{
    int i = 100;
}
class supB extends supA{
      int  i = 10;
    public void m1(){
        System.out.println(this.i);
        System.out.println(super.i);
    }
}