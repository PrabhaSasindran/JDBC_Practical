import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args){
        System.out.println("Enter the digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        while(n>0){
            int r = n%10;
            prod = prod*r;
            n= n/10;
        }
          System.out.println("Product of digits is :: "+prod);
    }
}
