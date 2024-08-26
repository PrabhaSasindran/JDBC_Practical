package ArrayPack;

public class LargestNumberInArray {
    public static void main(String[] args){
    int[] a = {174,118,298,67,123,89,166};
    int large = a[0];
    for(int i=1;i<=a.length-1;i++){
       if(a[i]>large){
          large = a[i];
       }
    }
    System.out.println("largest "+large);
    }
}
