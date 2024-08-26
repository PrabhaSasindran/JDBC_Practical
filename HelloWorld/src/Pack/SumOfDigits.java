package Pack;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.println("Enter the digit  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n>0){
            int r=n%10;
            n = n/10;
            sum= sum+r;
        }
        System.out.println(sum);
    }
}
