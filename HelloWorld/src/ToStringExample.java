public class ToStringExample {
    public static void main(String[] args){
        T t = new T();
        System.out.println(t);
    }
}
class T extends Object{
    @Override
    public String toString() {
        return "bye bye";
    }
}