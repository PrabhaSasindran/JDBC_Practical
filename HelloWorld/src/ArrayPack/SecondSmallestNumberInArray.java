package ArrayPack;

public class SecondSmallestNumberInArray {
    public static void main(String[] args){
        int[] a  ={174,118,298,67,123,89,166};
        int small = Integer.MAX_VALUE;
        int secondSmall =Integer.MAX_VALUE;
        for(int i =0;i<=a.length-1;i++){
            if(a[i]<small){
                secondSmall = small;
                small=a[i];
            } else if (a[i]<secondSmall && a[i]!= small) {
                secondSmall=a[i];
            }
        }
        System.out.println("Second smallest number "+secondSmall);
    }
}
