import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        System.out.println("Enter the number :" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp =0;
        int sum = 0;
        temp =n;
        while(n>0){
            n= n/10;
            count ++;
        }
        n = temp;
        while(n>0){
            int r = n%10;
            n= n/10;
            sum += Math.pow(r,count);
        }
        if(sum==temp){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
