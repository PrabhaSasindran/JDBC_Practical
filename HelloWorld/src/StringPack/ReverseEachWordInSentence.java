package StringPack;

public class ReverseEachWordInSentence {
    public static void main(String[] args){
        String s = "There is a beautiful flower in the garden";
        String[] str = s.split(" ");
        String temp ="";
        for(int i =0;i<str.length-1;i++){
            temp += reverse(str[i]);
            temp += " ";
        }
        System.out.println(temp);
    }
    public static String reverse(String str){
        char[] ch = str.toCharArray();
        int i =0;
        int j = ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j]= temp;
            i++;
            j--;
        }
        str = new String(ch);
        return str;
    }
}
