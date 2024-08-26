package ArrayPack;

import java.util.Arrays;
import java.util.Scanner;

public class EnterElementsInArray {
    public static void main(String[] args){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<=size-1;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
