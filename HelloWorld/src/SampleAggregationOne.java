public class SampleAggregationOne {
    public static void main(String[] args){
        new BCOne().m2();
    }
}
class BCOne{
    CCOne c;
    public void m2(){
        c = new CCOne();
        display();
    }
    public void display(){
        c.m1();
    }
}
class CCOne{
    public void m1(){
        System.out.println("hiii");
    }
}