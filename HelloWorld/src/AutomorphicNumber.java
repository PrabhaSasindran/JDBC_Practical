import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 0;
        prod = n*n;
        int count=0;
        int temp =0;
        temp = n;
        while(n>0){
            n= n/10;
            count++;
        }
        int lastDigit = (int) ((int)prod%(Math.pow(10,count)));
        if(lastDigit==temp){
            System.out.println("Automorphic number");
        }else {
            System.out.println("not Automorphic number");
        }
    }
}
