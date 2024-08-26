public class TightCouplingExample {
    public static void main(String[] args){
        //new TCB().m2();
        TCB b = new TCB();
        b.m2();
    }
}
class TCA{
    public String m1(){
       return " Hello tight coupling";
    }
}
class TCB extends TCA{
    public void m2(){
        System.out.println(new TCA().m1());
    }
}