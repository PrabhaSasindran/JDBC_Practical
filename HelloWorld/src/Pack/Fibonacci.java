package Pack;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            sum =  (a+ b);
            System.out.println(sum);
            a= b;
            b= sum;
        }
    }
}
