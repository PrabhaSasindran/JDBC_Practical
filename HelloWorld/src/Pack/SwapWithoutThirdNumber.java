package Pack;

public class SwapWithoutThirdNumber {
    public static void main(String[] args){
        int a = 8;
        int b = 12;
        System.out.println(" a value is " + a + " b value is " + b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println(" a value is " + a + " b value is " + b);

    }
}
