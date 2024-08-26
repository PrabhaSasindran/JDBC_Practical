import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println("Enter thew number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int r =0;
        for(int i =1;i<=n/2;i++){
            r = n%i;
            if(r==0){
              sum = sum+i;
            }
        }
        System.out.println(sum +"  "+n);
        if(sum==n){
           System.out.println("perfect number");
        }else{
            System.out.println("Not perfect number");
        }

    }
}
