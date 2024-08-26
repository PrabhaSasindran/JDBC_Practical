public class ThisKeywordExample {
    public static void main(String[] args){
        new SampleOne().add();
    }

}
class SampleOne{
    static int a = 30;
    int b = 20;
    public void add(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}