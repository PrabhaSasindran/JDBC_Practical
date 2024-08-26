public class SingletonExample {
    public static void main(String[] args){
        SA b = SA.getInstance();
        SA c = SA.getInstance();
        if(b==c){
            System.out.println("same");
        }else{
            System.out.println("different");
        }
    }
}
class SA{
    private static SA a = null;
    private SA(){
        System.out.println("private con");
    }
    public static SA getInstance(){
        if(a==null){
            a = new SA();
        }
        return a;

    }
}