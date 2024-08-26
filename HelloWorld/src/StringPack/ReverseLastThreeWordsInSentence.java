package StringPack;

public class ReverseLastThreeWordsInSentence {
    public static void main(String[] args){
        String s = "There is a beautiful flower in the garden";
        System.out.println(s);
        String[] s1 = s.split(" ");
        int count = 0;
        String temp ="";
        for(int i = s1.length-1;i>=0;i--){
            if(count<3){
                temp+= reverse(s1[i]);
                temp += " ";
                count++;
            }else{
                temp += s1[i];
                temp += " ";
            }
        }
        System.out.println(temp);
        String[] s2 = temp.split(" ");
        String temp2 ="";
        for(int i =s2.length-1;i>=0;i--){
            temp2 += s2[i];
            temp2 += " ";
        }
        System.out.println(temp2);
    }
    public static String reverse(String str){
        char[] ch = str.toCharArray();
        int i =0;
        int j = ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] =  ch[j];
            ch[j]= temp;
            i++;
            j--;
        }
        str= new String(ch);
        return str;
    }

}
