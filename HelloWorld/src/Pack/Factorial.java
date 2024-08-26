package Pack;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int fact = 1;
        System.out.println("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Factorial of 0 is  "+ 1);
        }else {
            for(int i = 1; i<=n;i++){
                fact = fact*i;
            }
            System.out.println("Factorial is  "+ fact);
        }
    }

}
