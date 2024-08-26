public class DataEncapsExample {
    public static void main(String[] args){
      EncapA a = new EncapA();
      System.out.println(a.getI());
      a.setI(10);
      System.out.println(a.getI());
    }
}

class EncapA{
    private int i;
    public int getI(){
        return i;
    }
    public void setI(int i){
        this.i=i;
    }
}