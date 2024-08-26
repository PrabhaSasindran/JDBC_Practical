package ArrayPack;

public class AdditionOFDiagonalAntiDiagonal {
    public static void main(String[] args){
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int diagonalSum =0;
        int antiDiagonalSum =0;
        int total =0;
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a.length-1;j++){
                if(i==j){
                    diagonalSum += a[i][j];
                }
            }
        }
        for(int i =0;i<=a.length-1;i++){
            if(i!=(a.length-1-i)){
              antiDiagonalSum +=a[i][a.length-1-i];
            }
        }
        total = diagonalSum+antiDiagonalSum;
        System.out.println("adding diagonals and antidiagonals "+total);
    }
}
