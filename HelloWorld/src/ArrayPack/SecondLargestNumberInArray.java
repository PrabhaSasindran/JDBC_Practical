package ArrayPack;

public class SecondLargestNumberInArray {
    public static void main(String[] args){
        int[] a = {174,198,298,67,123,289,166};
        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0;i<=a.length-1;i++){
            if(a[i]>large){
                secondLargest = large;
                large = a[i];
            } else if (a[i]>secondLargest && a[i]!=large) {
                secondLargest = a[i];
            }
        }
        System.out.println("second largest "+secondLargest);
    }
}
