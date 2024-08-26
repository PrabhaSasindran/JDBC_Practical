package StringPack;

public class ReverseSentence {
    public static void main(String[] args){
        String s = "There is a beautiful flower in the garden";
        String[] str = s.split(" ");
        String temp ="";
        for(int i= str.length-1;i>=0;i--){
            temp += str[i];
            temp += " ";
        }
        temp = temp.trim();
        System.out.println(temp);
    }
}
