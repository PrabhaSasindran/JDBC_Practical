import java.util.Scanner;

public class PatternTwoSquaresStars {
    public static  void main(String[] args){
        System.out.println("Enter the limit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
