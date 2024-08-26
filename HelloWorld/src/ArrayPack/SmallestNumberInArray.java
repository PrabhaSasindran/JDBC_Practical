package ArrayPack;

public class SmallestNumberInArray {
    public static void main(String[] args){
        int[] a = {14,23,6,12,1,50};
        int small = a[0];
        for(int i =1;i<=a.length-1;i++){
            if(small>a[i]){
                small = a[i];
            }
//            if(a[i]<small){
//                small=a[i];
//            }
        }
        System.out.println(small);
    }
}
