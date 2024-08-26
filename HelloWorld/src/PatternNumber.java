import java.util.Scanner;

public class PatternNumber {
    public static void main(String[] args){
        System.out.println("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
