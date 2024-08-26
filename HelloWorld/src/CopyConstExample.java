public class CopyConstExample {
    public static void main(String[] args){
        ConstCopyOne conOne =new ConstCopyOne();
        ConstCopy con =new ConstCopy(conOne);
    }
}
class ConstCopy{
    public ConstCopy(ConstCopyOne concp){
        concp.display();
    }
}
class ConstCopyOne{
    public void display(){
        System.out.println("Copy Constructor");
    }
}