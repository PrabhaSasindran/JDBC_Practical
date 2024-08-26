public class FinStatNonstatExample {
    final static int i;
    final int j;
    static{
        i=10;
    }
    {
        j=20;
    }
    public static void main(String[] args){
        final int k;
        k =30;
        System.out.println(FinStatNonstatExample.i+" "+ new FinStatNonstatExample().j +" "+k);

    }
}
