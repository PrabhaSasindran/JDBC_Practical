package SortingAndSearching;

public class BinarySearch {
    public static void main(String[] args){
        int[] a ={1,16,8,2,33};
        //int[] a = {65,76,112,3,98,54,31,8};
        int position = Search(a, 16);
        System.out.println(position);
    }
    public static int Search(int[] a, int num){
        int start =0; int end = a.length-1;
        int mid=0;
        while(start<=end){
            mid = (start+end)/2;
            if(a[mid]==num){
                return  mid;
            } else if (num<a[mid]) {
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
