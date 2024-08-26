import java.util.Scanner;

public class ArmstrongNumberDescendingOrder {
    public static void main(String[] args){
        System.out.println("Enter the upper limit");
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int temp =0;
        for(int i = u; i>0; i--){
            int count =0;
            int sum = 0;
            temp = i;
            while(i>0){
                i = i/10;
                count ++;
            }
            i = temp;
            while(i>0){
                int r = i%10;
                sum+= Math.pow(r,count);
                i = i/10;
            }
            if(temp == sum){
                System.out.println("Armstrong number "+temp);
            }
            i = temp;
        }
    }
}

