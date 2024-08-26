package Pack;

public class condition {
    public static void main(String[] args){
        if(10>8){
            System.out.println("Hi");
        }
        if(10<2){
            System.out.println("Hi");
        }else {
            System.out.println("Hello");
        }
        if(10<2){
            System.out.println("Hi");
        }else if(10==10){
            System.out.println("Hello");
        } else if (10>90) {
            System.out.println("Jai");
        } else if ("v".equals("W")) {
            System.out.println("happy");
        }else {
            System.out.println("mone");
        }
        switch ('d'){
            case 'a': System.out.println("mone");
            break;
            case 'b': System.out.println("hai");
            break;
            case 'c': System.out.println("hello");
            break;
            default: System.out.println("no match");
        }
        switch (10){
            case 1: System.out.println("mone");
                break;
            case 2: System.out.println("hai");
                break;
            case 3: System.out.println("hello");
                break;
            default: System.out.println("no match");
        }

        for (int i =1;i<=10;i++){
            System.out.println("Hi " + i);
        }
        int i = 1;
        while(i<=5){
            System.out.println("Hi " + i);
            i++;
        }
        int p = 1;
        do {
            System.out.println("Hi " + p);
            p++;
        }while (p <=5);
        int q = 1;
        do {
            System.out.println("Hi " + q);
            q++;
        }while (q >5);

    }
}
