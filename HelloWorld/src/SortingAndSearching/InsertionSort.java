package SortingAndSearching;

public class InsertionSort {
    public static void main(String[] args){
        int[] a ={8,6,9,12,4,5};
        sort(a);
        for(int n:a){
            System.out.print(n+" ");
        }
    }

   public static void sort(int[] a){
        for(int i =1;i<a.length;i++){
            int key = a[i];
            int j = i -1;
            while(j>-1  && a[j]>key){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
       }
}
