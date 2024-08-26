package StringPack;

public class GetLastThreeWordsInSentence {
    public static void main(String[] args){
        String s = "There is a beautiful flower in the garden";
        String[] s1 = s.split(" ");
        String temp ="";
        if(s1.length>3){
            temp+= s1[s1.length-3]+" "+s1[s1.length-2]+" "+s1[s1.length-1];
            System.out.println(temp);
        }


//        System.out.println("Reverse the last three words in the sentence");
//        String str ="There is a beautiful flower in the garden";
//        String[] str1 = str.split(" ");
//        String temp ="";
//        if(str1.length>3){
//            for(int i = str1.length-3;i<=str1.length-1;i++){
//                temp += str1[i];
//                temp += " ";
//            }
//            temp = temp.trim();
//            System.out.println(temp);
//        }
    }

}
