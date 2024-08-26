import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =0;
        temp=n;
        int r =0;
        int sum =0;
        int fact =1;
        while(n>0){
            r = n%10;
            for(int i =1;i<=r;i++){
                fact= fact*i;
            }
            sum= sum+fact;
            System.out.println(fact);
            fact =1;
            n= n/10;
        }
        if(sum==temp){
          System.out.println("Strong number");
        }else{
            System.out.println("Not Strong number");
        }
    }
}
