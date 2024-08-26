package StringPack;

public class ReverseStringWithoutCharAt {
    public static void main(String[] args){
        String s = "jaraganak";
        char[] ch = s.toCharArray();
        int i =0;
        int j = ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        System.out.println(new String(ch));
    }
}
