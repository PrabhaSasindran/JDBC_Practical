import java.util.Scanner;

public class OddArmstrongNumberWithinRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int u = sc.nextInt();
        System.out.println("Enter the lower limit");
        int l = sc.nextInt();
        int temp =0;
        for(int i = l; i<u; i++){
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
                if(temp%2!=0){
                    System.out.println("Odd Armstrong number "+temp);
                }
            }
            i = temp;
        }
    }
}
