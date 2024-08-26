package SortingAndSearching;

public class SelectionSort {
    public static void main(String[] args){
        int[] a = {8,6,9,12,4,5};
        sort(a);
        for(int n:a){
          System.out.print(n+" ");
        }
    }
    public static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int minIndex = i;
            for(int j =i+1;j<a.length;j++){
                if(a[minIndex]>a[j]){
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] =temp;
        }
    }
}
