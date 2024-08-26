import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args){
        System.out.println("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space =0;
        int star =0;
        for(int i =1;i<=n;i++){
            space = n-i;
            star=i;
            while(space>0){
                System.out.print("_ ");
                space--;
            }
            while(star>0){
                System.out.print("* ");
                star--;
            }
            System.out.println();
            }



    }
}
