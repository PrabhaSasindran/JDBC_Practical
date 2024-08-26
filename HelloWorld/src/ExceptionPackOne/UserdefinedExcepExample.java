package ExceptionPackOne;

public class UserdefinedExcepExample {
    public static void main(String[] args){
        try {
            new C().check();
        }catch(AbsentException abe){
            System.out.println(abe.getMessage());
        }

    }
}
class C{
    public void check() throws AbsentException{
        int noOfDays =0;
        if(noOfDays!=0){
            System.out.println("Days " +noOfDays);
        }else{
            throw new AbsentException("not sufficient");
        }
    }

}
class AbsentException extends Exception{
   public AbsentException(String str){
    super(str);
   }
}