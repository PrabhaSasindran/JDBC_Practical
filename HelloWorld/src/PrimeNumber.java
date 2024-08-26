import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Enter the number :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean isPrime = true;
        if(n==1){
            //System.out.println("Not a prime number");
            isPrime = false;
        }else{
            for(int i = 2;i<=n/2;i++){
                if(n%i==0){
                   // System.out.println("Not a prime number");
                    isPrime = false;
                    break;
                }
            }

        }
        if(!isPrime){
          System.out.println("Not a prime");
        }else{
            System.out.println("Prime");
        }

    }
}
