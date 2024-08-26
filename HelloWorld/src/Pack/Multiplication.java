package Pack;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(i+"*"+a+"="+(i*a));
        }
    }
}
