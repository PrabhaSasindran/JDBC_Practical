package ArrayPack;

public class MultiplicationOfTwoDimensionalArrays {
    public static void main(String[] args){
        int[][] a ={
                {1,1,1},
                {2,2,2},
                {3,3,3}
        };
        int[][] b ={
                {2,1,2},
                {2,2,1},
                {1,1,1}
        };
        int[][] sum={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        for(int i =0;i<=a.length-1;i++){
            for(int j =0;j<=a.length-1;j++){
                for(int k=0;k<=a.length-1;k++){
                    sum[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
