package StringPack;

public class StringEqualtoEqualsOperator {
    public static void main(String[] args){
        String s = "hello";
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "Hello";
        String s5 = "Hello";
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s==s3);
        System.out.println(s.equals(s2));
//        if(s1==s3){
//            System.out.println("same address");
//        }else{
//            System.out.println("different address");
//        }
//        if(s1.equals(s3)){
//            System.out.println("same string");
//        }else{
//            System.out.println("different string");
//        }
//        if(s==s3){
//            System.out.println("Same address");
//        }else {
//            System.out.println("different address");
//        }
//        if(s.equals(s2)){
//            System.out.println("Same string");
//        }else{
//            System.out.println("different string");
//        }
//        if(s1==s2){
//            System.out.println("same address");
//        }else{
//            System.out.println("different address");
//        }

    }
}
