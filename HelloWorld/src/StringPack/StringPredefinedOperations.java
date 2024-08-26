package StringPack;

public class StringPredefinedOperations {
    public static void main(String[] args){
        String s= "jarag anak";
        String s1 = "Jarag anak";
        System.out.println(s.length());
        System.out.println(s.charAt(7));
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.contains("z"));
        System.out.println(s.startsWith("jar"));
        System.out.println(s.endsWith("anaka"));
        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}
