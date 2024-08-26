package Pack;

public class LetsCast {
    public static void main(String[] args){
//        System.out.println("Widening");
//        byte b= 127;
//        int i = b;
//        System.out.println(i);

//        System.out.println("Narrowing");
//        int i = 127;
//        byte b= (byte)i;
//        System.out.println("int  to byte, value of b is "+ b);

//        System.out.println("Widening");
//        byte b= 10;
//        //int i = (int)b;
//        int i = b;
//        System.out.println("byte to int, value of i is  "+i);


        System.out.println("Narrowing");
        int i = 10;
        byte b = (byte)i;
        System.out.println("int to byte, value of b is  "+b);

    }
}
