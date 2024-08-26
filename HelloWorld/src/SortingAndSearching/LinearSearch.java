package SortingAndSearching;

public class LinearSearch {
    public static void main(String[] args){
        int[] a ={15,4,17,8,6,3};
        int position = Search(a,3);
        System.out.println(position);
    }
    public static int Search(int[] a, int num){
        for(int i =0;i<=a.length-1;i++){
            if(a[i]==num){
                return i;
            }
        }
       return  -1;
    }
}
