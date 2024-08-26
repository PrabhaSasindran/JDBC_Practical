package packExample;

import packExample1.AAA;

public class FFF extends AAA {
    public static void main(String[] args){
        FFF f = new FFF();
        f.m1();
        System.out.println(f.i);
        FFF.m2();
        System.out.println(FFF.j);
    }
}
