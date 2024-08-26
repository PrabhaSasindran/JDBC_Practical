package StringPack;

public class NumberOfOccuranceOfCharacter {
    public static void main(String[] args){
        String s = "kanagaraj";
        int j = s.length();
        int i =0;
        while(i<j){
            char c = s.charAt(i);
            String s1 = s.replace(c+"","");
            int count = s.length()-s1.length();
            System.out.println(c+"    "+count);
            i++;
        }


    }
}
