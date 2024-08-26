package ArrayPack;

public class AdditionOfDiagonalElementsInArray {
    public static void main(String[] args){
        int[][] a = {
                {4,6,3},
                {2,1,8},
                {5,7,9}
        };
        int sum =0;
        for(int i=0;i<=a.length-1;i++){
            for(int j =0;j<=a.length-1;j++){
                if(i==j){
                    sum +=a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
