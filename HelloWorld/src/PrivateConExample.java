public class PrivateConExample {
    public static void main(String[] args){
        PA a = PA.getInstance();
        PA b = PA.getInstance();
        if(a==b){
          System.out.println("same");
        }else{
            System.out.println("different");
        }
    }
}
class PA{
    private PA(){
        System.out.println("Private con");
    }
    public static PA getInstance(){
        return new PA();
    }
}