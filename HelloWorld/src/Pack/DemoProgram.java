package Pack;

public class DemoProgram {
    static int b = 30;
    int c = 50;
    public static void main(String[] args){
        int a;
        a = 10;
        System.out.println("local variable value "+ a);
        System.out.println("Inside the same class "+ b);

        Demo d = new Demo();
        d.addMethod();
        DemoProgram dp = new DemoProgram();
        dp.add();
        System.out.println("static variable using object reference " + dp.b);
        System.out.println("Non static variable inside static method "+ dp.c);
    }
    public void add() {
        System.out.println("inside add method of the same class " + b);
        System.out.println("Non static variable inside non static method"+ c);
    }
}
class Demo{
    public void addMethod(){
        System.out.println("outside of the class "+ DemoProgram.b);
        DemoProgram d1 = new DemoProgram();
        System.out.println("Non static variable in another class"+ d1.c);
    }
}