package Pack;

import javax.swing.text.html.HTML;

public class MethodsDiff {
    public static void main(String[] args){

        oneMethod.add();
        System.out.println("inside main");
        oneMethod one = new oneMethod();
        one.print();
        System.out.println(oneMethod.adds(20));
        System.out.println(one.addon(8,4));
        oneMethod.move(89);
        one.look(35,5);
    }
}
class oneMethod{
    public static void add(){
        System.out.println("Hi inside static method");
    }
    public void print(){
        System.out.println("inside non static method");
    }
    public static int adds(int a){
        return a+4;
    }
    public int addon(int c,int b){
      return b+c;
    }
    public static void move(int k){
        System.out.println(k);
    }
    public void look(int i, int j){
        System.out.println(i-j);
    }
}