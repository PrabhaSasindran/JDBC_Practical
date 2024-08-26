package Pack;

public class SampleRecursion {
    public static void main(String[] args){
       // recuMethod(1);
       m1(1);
    }

    public static void m1(int i){
        System.out.println(i);
        if(i>=3)
            return;
        m1(i+1);
        System.out.println(i);
    }
//    public static void recuMethod(int i){
//      System.out.println( i);
//      if(i>=3){
//          return;
//      }
//      recuMethod(i+1);
//      recuMethod(i+1);
//      System.out.println("hi "+ i);
//    }


//        public static void recuMethod(int i){
//        if(i==5){
//            return;
//        }
//        System.out.println(i);
//        i++;
//        recuMethod(i);
//    }

}
