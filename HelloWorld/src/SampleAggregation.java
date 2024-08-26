public class SampleAggregation {
    public static void main(String[] args){
        new BOne().m2();
    }
}
class BOne{
    public void m2(){
        COne.m1();
    }
}

class COne{
    public static void m1(){
        System.out.println("hiii");
    }

}