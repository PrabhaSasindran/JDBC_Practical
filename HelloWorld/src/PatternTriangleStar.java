import java.util.Scanner;

public class PatternTriangleStar {
    public static void main(String[] args){
        System.out.println("Enter the limit");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int space = n-1;
       //int space = n;
       int star = 1;
       for(int i=1;i<n;i++){
           for(int j=1;j<=space;j++){
               System.out.print("   ");
           }
           for(int k=1;k<=star;k++){
               System.out.print(" * ");
           }
           System.out.println();
           space = space -1;
           star = star+2;
       }
    }
}
