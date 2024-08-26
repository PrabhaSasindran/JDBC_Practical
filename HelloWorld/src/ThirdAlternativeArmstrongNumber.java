import java.util.Scanner;

public class ThirdAlternativeArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit :" );
        int l = sc.nextInt();
        System.out.println("Enter the upper limit :" );
        int u = sc.nextInt();
        for(int i = l;i<=u;i+=3){
            int n= i;
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
                System.out.println("Armstrong number"+ temp);
            }
        }

    }
}
