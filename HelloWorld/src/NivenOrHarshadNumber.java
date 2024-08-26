import java.util.Scanner;

public class NivenOrHarshadNumber {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =0;
        temp = n;
        int sum =0;
        int r =0;
        while(n>0){
            r = n%10;
            sum = sum+r;
            n = n/10;
        }
        n= temp;
        System.out.println(sum);
        System.out.println(n);
        if(n%sum==0){
            System.out.println("Niven or Harshad number");
        }else {
            System.out.println("Not Niven or Harshad number");
        }

    }
}
