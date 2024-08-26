public class supImplicitExample {
    public static void main(String[] args){
        new SupImplC();
    }
}
class SupImplB{
    public SupImplB(){
        System.out.println("Parent con");
    }
}
class SupImplC extends SupImplB{
    public SupImplC(){
        // super() - implicit
        System.out.println("Child con");
    }
}