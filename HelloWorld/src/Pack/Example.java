package Pack;

public class Example {
    public static void main(String[] args){
        System.out.println("in main");
        Exam ex = new Exam();
        ex.sample();
    }
}
//class Exam {
//    public void sample(){
//        System.out.println("inside sample before for loop");
//        int i;
//        for(i=1;i<=5;i++){
//            System.out.println("inside for loop  " +i);
//            break;
//        }
//        System.out.println("inside sample exited for loop");
//    }
//}

//class Exam {
//    public void sample(){
//
//        int i;
//        for(i=1;i<=4;i++){
//            if(i==3){
//              System.out.println("inside if ");
//              continue;
//            }
//            System.out.println("inside for " + i);
//        }
//
//    }
//}

class Exam {
    public void sample(){
       System.out.println("inside sample before return");
        int i;
        for(i=1;i<=5;i++){
            System.out.println("inside for loop  " +i);
            return;
        }
        System.out.println("inside sample exited for loop");

    }
}