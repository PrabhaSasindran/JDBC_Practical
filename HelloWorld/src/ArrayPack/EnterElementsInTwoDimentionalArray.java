package ArrayPack;

import java.util.Arrays;
import java.util.Scanner;

public class EnterElementsInTwoDimentionalArray {
    public static void main(String[] args){
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[3][2];
        for(int i=0;i<=3-1;i++){
            for(int j=0;j<=2-1;j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<=3-1;i++){
            for(int j=0;j<=2-1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
