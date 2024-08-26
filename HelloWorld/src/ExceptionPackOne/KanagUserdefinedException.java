package ExceptionPackOne;

public class KanagUserdefinedException {
    public static void main(){
        int n =0;
        if(n!=0){
            System.out.println(n);
        }else{
            throw new MissingException();
        }
    }
}
class MissingException extends RuntimeException{

}