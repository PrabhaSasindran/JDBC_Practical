package Pack;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Number num = new Number();
        num.name();

    }
}
class Number{
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is   "+ (a+b));
    }

    public void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String str = sc.nextLine();
        //String str = sc.next();
        System.out.println("Name is    "+ str);

    }
}