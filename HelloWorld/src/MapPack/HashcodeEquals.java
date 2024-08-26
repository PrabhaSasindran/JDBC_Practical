package MapPack;

public class HashcodeEquals {
    public static void main(String[] args){
        String s = "rani";
        String s1 = new String("rani");
        //String s1 = "rani";
        //String s1= "Rani";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
