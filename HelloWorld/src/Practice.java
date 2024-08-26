import javax.swing.text.Style;
import javax.xml.xpath.XPathEvaluationResult;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
    }
}










//        System.out.println("Singleton");
//        AAA a = AAA.getInstance();
//        AAA a1 = AAA.getInstance();
//        if(a==a1){
//            System.out.println("same");
//        }else{
//            System.out.println("different");
//        }
//    }
//}
//class AAA{
//    private static AAA a = null;
//    private AAA(){
//
//    }
//    public static AAA getInstance(){
//        if(a==null){
//           a = new AAA();
//        }
//        return a;
//    }
//}









//        System.out.println("Private constructor");
//        AAA a = AAA.getInstance();
//        AAA a1 = AAA.getInstance();
//        if(a==a1){
//            System.out.println("Same objects");
//        }else{
//            System.out.println("different objects");
//        }
//    }
//}
//class AAA{
//    private AAA(){
//
//    }
//    public static AAA getInstance(){
//        return new AAA();
//    }
//}








//        System.out.println("super() and this()");
//        new FFF();
//    }
//}
//class AAA{
//    public AAA(){
//        this(10);
//        System.out.println("hi");
//    }
//    public AAA(int a){
//        System.out.println("hi "+a);
//    }
//}
//class FFF extends AAA{
//    public FFF(){
//        super();
//        System.out.println("hello");
//    }
//}








//        System.out.println("Super constructor");
//        new FFF();
//    }
//}
//class AAA{
//    public AAA(){
//        System.out.println("parent constructor");
//    }
//}
//class FFF extends AAA{
//    public FFF(){
//        System.out.println("Child constructor");
//    }
//}






//        System.out.println("Super keyword");
//        new FFF().m1();
//    }
//}
//class AAA{
//    int i =100;
//}
//class FFF extends AAA{
//    int j = 10;
//    public void m1(){
//        System.out.println(this.j);
//        System.out.println(super.i);
//    }
//}









//        System.out.println("Instance of");
//        FFF f = new FFF();
//        System.out.println(f instanceof AAA);
//        System.out.println(f instanceof FFF);
//        System.out.println(f instanceof Object);
//        GGG g = new GGG();
//        System.out.println(g instanceof AAA);
//        System.out.println(g instanceof GGG);
//        System.out.println(g instanceof Object);
//    }
//}
//class AAA{
//
//}
//class FFF extends AAA{
//
//}
//class GGG extends AAA{
//
//}






//        System.out.println("package access modifier");
//        System.out.println(AAA.i);
//        AAA a = new AAA();
//        System.out.println(a.j);
//        AAA.m1();
//        a.m2();
//    }
//}
//class AAA{
//    static int i =10;
//    int j = 20;
//    static void m1(){
//        System.out.println("hi");
//    }
//    void m2(){
//        System.out.println("hello");
//    }
//}











//        System.out.println("Private access modifier");
//        new AAA().show();
//    }
//}
//class AAA{
//    private int i =10;
//    private static int j =20;
//    private void m1(){
//        System.out.println("hi");
//    }
//    private static void m2(){
//        System.out.println("hello");
//    }
//    public void show(){
//        System.out.println(i);
//        System.out.println(AAA.j);
//        m1();
//        AAA.m2();
//    }
//}









//        System.out.println("Method overriding");
//        FFF f = new FFF();
//        f.m1();
//        f.m2();
//    }
//}
//class AAA{
//    public void m1(){
//        System.out.println("parent m1");
//    }
//    public void m2(){
//        System.out.println("Parent m2");
//    }
//}
//class FFF extends AAA{
//    public void m1(){
//        System.out.println("Child m1");
//    }
//}








//        System.out.println("Composition");
//        FFF f = new FFF();
//        AAA a = new AAA(f);
//    }
//}
//class AAA{
//    FFF f;
//    public AAA(FFF f){
//       this.f = f;
//       m2();
//    }
//    public void m2(){
//        f.m1();
//    }
//}
//class FFF{
//    public void m1(){
//     System.out.println("hi");
//    }
//}









//        System.out.println("aggregation has a relation");
//        new AAA().m2();
//    }
//}
//class AAA{
//    FFF f;
//    public void m2(){
//        f = new FFF();
//        display();
//    }
//    public void display(){
//        f.m1();
//    }
//}
//class FFF{
//    public void m1(){
//        System.out.println("hi");
//    }
//}










//        System.out.println("Aggregation- has a relation");
//        new AAA().m2();
//    }
//}
//class AAA{
//    public void m2(){
//        FFF.m1();
//    }
//}
//class FFF{
//    public static void m1(){
//        System.out.println("hi");
//    }
//}









//    final static int i;
//    final int j;
//    static{
//        i=10;
//    }
//    {
//        j=30;
//    }
//    public static void main(String[] args) {
//        System.out.println("Final");
//        final int k =70;
//        System.out.println(Practice.i+"  "+ new Practice().j+"  "+ k);
//    }
//}










//        System.out.println("this()");
//        AAA a = new AAA();
//    }
//}
//class AAA{
//    public AAA(){
//        this(10,20);
//        System.out.println("hi 1" );
//    }
//    public AAA(int a){
//        System.out.println("h1 2 " +a);
//    }
//    public AAA(int a, int b){
//        this(10);
//        System.out.println("hi 3");
//    }
//}












//        System.out.println("Odd armstrong number within the range");
//        System.out.println("Enter the limit");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            int temp = i;
//            int count =0;
//            int r =0;
//            int sum =0;
//            while(i>0){
//                i = i/10;
//                count ++;
//            }
//            i = temp;
//            while(i>0){
//                r = i%10;
//                i =i/10;
//                sum += Math.pow(r, count);
//
//            }
//            i=temp;
//            if(i==sum){
//                if(i%2==0){
//                    System.out.println(i +" is even armstrong number");
//                }
//                if(i%2!=0){
//                    System.out.println(i +" is odd armstrong number");
//                }
//            }
//        }
//    }
//}












//        System.out.println("Armstrong  number in descending order");
//        System.out.println("enter the upper limit");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =n;i>=0;i--){
//            int m =i;
//            int temp = m;
//            int count = 0;
//            int r =0;
//            int sum =0;
//            while(m>0){
//                m = m/10;
//                count++;
//            }
//            m =i;
//            while(m>0){
//                r = m%10;
//                m = m/10;
//                sum += Math.pow(r,count);
//            }
//            if(temp==sum){
//                System.out.println(i +" is an armstrong number");
//            }
//        }
//    }
//}











//        System.out.println("Armstrong number within the range");
//        System.out.println("Enter the limit");
//        Scanner sc = new Scanner(System.in);
//        int limit = sc.nextInt();
//                for(int i =1;i<=limit;i++){
//                    int count =0;
//                    int sum =0;
//                    int n =i;
//                    int temp = n;
//                    int r =0;
//                    while(n>0){
//                        n = n/10;
//                        count++;
//                    }
//                    n =temp;
//                    while(n>0){
//                        r =n%10;
//                        n=n/10;
//                        sum += Math.pow(r,count);
//                    }
//                    if(temp==sum){
//                        System.out.println(i +" is armstrong number");
//                    }
//                }
//    }
//}











//    System.out.println("Armstrong number");
//    System.out.println("Enter the number");
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int count =0;
//    int temp = n;
//    int r =0;
//    while (n>0){
//        n = n/10;
//        count++;
//    }
//    n = temp;
//    int sum =0;
//    while (n>0){
//        r = n%10;
//        n = n/10;
//        sum += Math.pow(r,count);
//    }
//    if(temp == sum){
//        System.out.println("Armstrong number");
//    }else {
//        System.out.println("Not an armstrong number");
//    }
//    }
//}


















//        System.out.println("Prime number");
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean isPrime = true;
//        if(n==1){
//            isPrime = false;
//        }
//        for(int i =2;i<=n/2;i++){
//            if(n%i==0){
//                isPrime = false;
//                break;
//            }
//        }
//        if(isPrime==true){
//            System.out.println("prime");
//        }else {
//            System.out.println("not prime");
//        }
//
//    }
//}











//        System.out.println("Binary search");
//        int[] a = {3,8,31,54,65,76,112};
//        int start =0;
//        int end = a.length-1;
//        int position = search(a,76);
//        System.out.println(position);
//    }
//    public static int search(int[] a, int num){
//        int start = 0;
//        int end = a.length-1;
//        int mid =0;
//        while(start<=end) {
//            mid = (start + end) / 2;
//            if (a[mid] == num) {
//                return mid;
//            } else if (num <= a[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
//}













//        System.out.println("Linear search");
//        int[] a = {65,76,112,3,98,54,31,8};
//        int position = search(a,65);
//        System.out.println(position);
//    }
//    public static int search(int[] a, int num){
//        int pos=0;
//        for(int i =0;i<=a.length-1;i++){
//            if(a[i]==num){
//                pos =i;
//            }
//        }
//        return pos;
//    }
//}









//    System.out.println("Multiplication of arrays");
//    int[][] a ={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//    int[][]b ={
//            {9,8,7},
//            {6,5,4},
//            {3,2,1}
//    };
//    int[][] p={
//            {0,0,0},
//            {0,0,0},
//            {0,0,0}
//    };
//    for(int i =0;i<=a.length-1;i++){
//        for(int j=0;j<=a.length-1;j++){
//            for(int k=0;k<=a.length-1;k++){
//                p[i][j]+= a[i][k]*b[k][j];
//            }
//            System.out.print(p[i][j]+" ");
//        }
//        System.out.println();
//    }
//    }
//}












//        System.out.println("Addition of diagonal and antidiagonal elements ");
//        int[][] a ={
//                {9,8,17},
//                {6,5,4},
//                {3,2,1}
//        };
//        int sum =0;
//        for(int i =0;i<=a.length-1;i++){
//            System.out.println(a[i][i]);
//            sum+= a[i][i];
//            if(i!=a.length-1-i){
//                System.out.println(a[i][a.length-1-i]);
//                sum += a[i][a.length-1-i];
//            }
//        }
//        System.out.println(sum);
//    }
//}








//        System.out.println("Addition of antidiagonal elements ");
//        int[][] a ={
//                {9,8,7},
//                {6,5,4},
//                {3,2,1}
//        };
//        int sum =0;
//        for(int i =0;i<=a.length-1;i++){
//            System.out.println(a[i][a.length-1-i]);
//            sum += a[i][a.length-1-i];
//        }
//        System.out.println(sum);
//    }
//}











//    System.out.println("addition of diagonal elements");
//    int[][] a ={
//            {4,5,6},
//            {1,12,3},
//            {7,8,9}
//    };
//    int sum =0;
//    for(int i =0;i<=a.length-1;i++){
//        for(int j=0;j<=a.length-1;j++){
//            if(i==j){
//               System.out.println(a[i][i]);
//               sum +=a[i][i];
//            }
//        }
//    }
//    System.out.println(sum);
//    }
//}







//        System.out.println("Entering elements in two dimensional array");
//        Scanner sc = new Scanner(System.in);
//        int[][] a = new int[3][2];
//        for(int i =0;i<=3-1;i++){
//            for(int j =0;j<=2-1;j++){
//                a[i][j]=sc.nextInt();
//            }
//        }
//        for(int i =0;i<=3-1;i++){
//            for(int j =0;j<=2-1;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}













//        System.out.println("Enter elements in an array");
//        System.out.println("Enter the size of the array");
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] a = new int[size];
//        System.out.println("Enter elements");
//        for(int i =0;i<=a.length-1;i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//    }
//}










//        System.out.println("Second largest number in an array");
//        int[] a = {65,76,112,3,98,54,31,8};
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        for(int i =0;i<=a.length-1;i++){
//           if(a[i]>largest){
//               secondLargest = largest;
//               largest =a[i];
//           } else if (a[i]>secondLargest && a[i]!=largest) {
//              secondLargest = a[i];
//           }
//        }
//        System.out.println(secondLargest);
//    }
//}












//        System.out.println("Second smallest number in an array");
//        int[] a = {65,76,112,3,98,54,31,8};
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//        for(int i =0;i<=a.length-1;i++){
//            if(a[i]<smallest){
//                secondSmallest= smallest;
//                smallest=a[i];
//            } else if (a[i]<secondSmallest && a[i]!=smallest) {
//                secondSmallest = a[i];
//            }
//        }
//        System.out.println(secondSmallest);
//    }
//}











//        System.out.println("quick sort");
//        int[] a = {3,6,1,19,88,12,4};
//        int start =0;
//        int end = a.length-1;
//        sort(a,start,end);
//        for(int n:a){
//          System.out.println(n);
//        }
//
//    }
//    public static void sort(int[] a, int start, int end){
//        if(start>=end){
//            return;
//        }
//        int pivot = a[(start+end)/2];
//        int i = start;
//        int j = end;
//        while (i<=j){
//            while(a[i]<pivot){
//                i++;
//            }
//            while (a[j]>pivot){
//                j--;
//            }
//            if(i<=j){
//                int temp = a[i];
//                a[i]=a[j];
//                a[j]=temp;
//                i++;
//                j--;
//            }
//        }
//        sort(a,start,j);
//        sort(a,i,end);
//    }
//}











//        System.out.println("Selection sort");
//        int[] a = {65,76,112,3,98,54,31,8};
//        for(int i =0; i<a.length-1;i++){
//            int minIndex =i;
//            for(int j=i+1;j<a.length;j++){
//                if(a[minIndex]>a[j]){
//                    minIndex=j;
//                }
//            }
//            int temp = a[i];
//            a[i]=a[minIndex];
//            a[minIndex] = temp;
//        }
//        for(int n:a){
//            System.out.println(n);
//        }
//    }
//}











//        System.out.println("Insertion sort");
//        int[] a = {65,76,112,3,98,54,31,8};
//        for(int i =1;i<a.length;i++){
//            int temp = a[i];
//            int j =i-1;
//            while(j>-1 && a[j]>temp){
//               a[j+1] = a[j];
//               j = j-1;
//            }
//            a[j+1] = temp;
//        }
//        for(int n:a) {
//            System.out.println(n);
//        }
//    }
//}











//        System.out.println("Bubble sort");
//        int[] a ={65,76,112,3,98,54,31,8};
//        for(int i =0;i<a.length-1;i++){
//            for(int j =0;j<a.length-1-i;j++){
//                if(a[j]>a[j+1]){
//                    int temp =a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//        for(int n:a){
//           System.out.println(n);
//        }
//    }
//}













//        System.out.println("Largest number in an array");
//        int[] a ={65,76,112,3,98,54,31,8};
//        int large = a[0];
//        for(int i =1;i<=a.length-1;i++){
//            if(large<a[i]){
//                large = a[i];
//            }
//        }
//        System.out.println(large);
//    }
//}












//        System.out.println("Smallest number in an array");
//        int[] a = {65,76,12,3,98,54,31,8};
//        int small =a[0];
//        for(int i=1;i<=a.length-1;i++){
//            if(small>a[i]){
//                small=a[i];
//            }
//        }
//        System.out.println(small);
//    }
//}










//        System.out.println("Reverse the last three words in a string");
//        String str = "There is a beautiful flower in the garden";
//        String[] str1 = str.split(" ");
//        String temp ="";
//        int count =0;
//        for(int i= str1.length-1;i>=0;i--){
//            if(count<3){
//                temp += reverse(str1[i]);
//                temp+=" ";
//                count++;
//            }else{
//                temp += str1[i];
//                temp += " ";
//            }
//        }
//        temp = temp.trim();
//        System.out.println(temp);
//        String[] str2 = temp.split(" ");
//        String temp1 ="";
//        for(int i =str2.length-1;i>=0;i--){
//            temp1 += str2[i];
//            temp1 +=" ";
//        }
//        System.out.println(temp1);
//    }
//    public static String reverse(String str){
//        char[] ch = str.toCharArray();
//        int i =0;
//        int j =str.length()-1;
//        while(i<j){
//            char temp = ch[i];
//            ch[i]= ch[j];
//            ch[j]= temp;
//            i++;
//            j--;
//        }
//        return new String(ch);
//    }
//}










//        System.out.println("Reverse the last three words in the sentence");
//        String str ="There is a beautiful flower in the garden";
//        String[] str1 = str.split(" ");
//        String temp1 ="";
//        String temp2 = "";
//        if(str1.length>3){
//            for(int i =0;i<str1.length-3;i++){
//                temp1 += str1[i];
//                temp1 += " ";
//            }
//            for(int i =str1.length-3;i<=str1.length-1;i++){
//                temp2 += reverse(str1[i]);
//                temp2 += " ";
//            }
//            temp2 =temp2.trim();
//        }
//        System.out.println(temp1+temp2);
//    }
//    public static String reverse(String str){
//        char[] ch = str.toCharArray();
//        int i = 0;
//        int j = ch.length-1;
//        while(i<j){
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j]=temp;
//            i++;
//            j--;
//        }
//        return new String(ch);
//    }
//}









//        System.out.println("get last three words of the given sentence");
//        String str = "There is a beautiful flower in the garden";
//        String[] str1  = str.split(" ");
//        String temp="";
//        if(str1.length>3){
//            temp += str1[str1.length-3]+" "+str1[str1.length-2]+" "+str1[str1.length-1];
//        }
//        System.out.println(temp);
//        }
//    }























//        String s1 = "Hello";
//        String s2 = "hello";
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(4));
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.contains("z"));
//        System.out.println(s1.startsWith("He"));
//        System.out.println(s1.endsWith("lo"));
//        System.out.println(s2.toUpperCase());
//        System.out.println(s1.toLowerCase());
//    }
//}




















//        System.out.println(".equals and ==/equalto operator");
//        String s = "hello";
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        String s3 = "hello";
//        String s4 = "Hello";
//        String s5 = "Hello";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        System.out.println(s4.equals(s5));
//        System.out.println(s4==s5);
//        System.out.println(s.equals(s3));
//        System.out.println(s==s3);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
//        System.out.println(s==s3);
//        System.out.println(s.equals(s2));
//        System.out.println(s==s2);
//    }
//}






//        System.out.println("replce character of a string");
//        String str ="kanagaraj";
//        System.out.println(str.replace('a','y'));
//        System.out.println(str.replace("raj","hai"));
//        System.out.println(str.replace("aga","hij"));
//    }
//}








//        System.out.println("Print the letters of a string");
//        String  str = "any string";
//        for(int i =0;i<str.length()-1;i++){
//            System.out.println(str.charAt(i));
//
//        }
//    }
//}










//        System.out.println("Number of occurance of characters in a string");
//        String str ="kanagaraj";
//        int i =0;
//        int j = str.length();
//        while(i<j){
//            int count =0;
//            String str1 ="";
//            char c = str.charAt(i);
//            str1 = str.replace(c+"","");
//            count = str.length()-str1.length();
//            System.out.println(c+" "+count);
//            i++;
//        }
//    }
//}











//        System.out.println("Reverse each word in reversed position");
//        String str = "There is a beautiful flower in the garden";
//        String[] str1 = str.split(" ");
//        String temp = "";
//        for(int i = str1.length-1;i>=0;i--)
//        {
//            temp += reverse(str1[i])+" ";
//        }
//        temp= temp.trim();
//        System.out.println(temp);
//    }
//    public static String reverse(String str){
//        char[] ch = str.toCharArray();
//        int i =0;
//        int j = str.length()-1;
//        while(i<j){
//           char temp = ch[i];
//           ch[i]= ch[j];
//           ch[j]= temp;
//           i++;
//           j--;
//        }
//        return new String(ch);
//    }
//}









//        System.out.println("Reverse the sentence");
//        String str = "There is a beautiful flower in the garden";
//        String[] str1 = str.split(" ");
//        String temp ="";
//        for(int i = str1.length-1;i>=0;i--)
//        {
//            temp += str1[i]+" ";
//        }
//        temp = temp.trim();
//        System.out.println(temp);
//    }
//}










//        System.out.println("Reverse each word in a sentence");
//        String str = "There is a beautiful flower in the garden";
//        String[] str1 = str.split(" ");
//        String temp ="";
//        for(int i =0;i<=str1.length-1;i++){
//            temp+= reverse(str1[i])+" ";
//        }
//        temp = temp.trim();
//        System.out.println(temp);
//    }
//    public static String reverse(String str){
//        char[] ch = str.toCharArray();
//        int i = 0;
//        int j = ch.length-1;
//        while(i<j){
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        return new String(ch);
//    }
//}










//        System.out.println("Reverse string using char array");
//        String str = "kanagaraj";
//        char[] ch = str.toCharArray();
//        int i =0;
//        int j = ch.length-1;
//        while(i<j){
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println(new String(ch));
//    }
//}










//        System.out.println("Reverse string");
//        String str = "kanagaraj";
//        String temp ="";
//        for(int i=str.length()-1;i>=0;i--){
//            temp += str.charAt(i);
//        }
//        System.out.println(temp);
//    }
//}








//        System.out.println("Loose coupling");
//        AAA a = new AAA();
//        a.show();
//        a.display();;
//    }
//}
//interface I{
//    public abstract void show();
//    public abstract void display();
//}
//class AAA implements I{
//    public void show(){
//        System.out.println("Show method");
//    }
//    public void display(){
//        System.out.println("display method");
//    }
//}










//        System.out.println("Tight coupling");
//        new H().m2();
//    }
//}
//class AAA{
//    public String m1(){
//        return "Hello";
//    }
//}
//class H extends AAA{
//    public void m2(){
//        System.out.println(new AAA().m1());
//    }
//}





//        System.out.println("User defined exception");
//        try {
//            new AAA().m1();
//        }catch (MyException e){
//           e.printStackTrace();
//        }
//        System.out.println("done");
//    }
//}
//class AAA{
//    int n=0;
//    public void m1() throws MyException{
//        if(n!=0){
//            System.out.println("Success");
//        }else {
//            throw new MyException("Cannot be zero");
//        }
//    }
//}
//class MyException extends Exception{
//    public MyException(String str){
//        super(str);
//    }
//}








//        System.out.println("Exception propagation");
//        try {
//            new AAA().show();
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println("Main end");
//    }
//}
//class AAA{
//    public void show() throws ClassNotFoundException{
//        Class.forName("AAA");
//    }
//}










//        try {
//            FileReader reader = new FileReader("C:\\Prabha\\sample1.txt");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
////        catch (FileNotFoundException e){
////            e.printStackTrace();
////        }
//    }
//}








//        System.out.println("Exception hierarchy");
//        try {
//            FileReader reader = new FileReader("C:\\Prabha\\sample1.txt");
//        }catch (ArithmeticException e){
//            System.out.println("arithmetic");
//            e.printStackTrace();
//        }catch (NumberFormatException e){
//            System.out.println("numberformat");
//            e.printStackTrace();
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("arrayindexoutofbound");
//            e.printStackTrace();
//        }catch (FileNotFoundException e){
//            System.out.println("filenotfound");
//            e.printStackTrace();
//        } catch (Exception e){
//            System.out.println("exception");
//            e.printStackTrace();
//        }
//    }
//}








//        System.out.println("Finally example");
//        try {
//            System.out.println(10/0);
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("i will be executed always");
//        }
//    }
//}









//        System.out.println("InterruptedException Example");
//        for(int i =1;i<=10;i++){
//            try {
//                Thread.sleep(500);
//                System.out.println(i);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Main end");
//    }
//}








//        System.out.println("class not found example");
//        try {
//            Class.forName("AAA");
//        }catch(ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println("main end");
//    }
//}
//class AAA{
//    public void m1(){
//        System.out.println("hi");
//    }
//}










//        System.out.println("FileNotFoundException");
//        try{
//            //FileReader reader = new FileReader("sample.txt");
//            FileReader reader = new FileReader("C:\\Prabha\\sample.txt");
//            System.out.println("File read successfully");
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println("main end");
//    }
//}











//        System.out.println("NumberFormatException");
//        String str ="10.0";
//        int a =0;
//        try {
//            a = Integer.parseInt(str);
//        }catch (NumberFormatException e){
//            e.printStackTrace();
//        }
//        System.out.println(a);
//        System.out.println("Main end");
//    }
//}











//        System.out.println("NullPointerException example");
//        String str = null;
//        try{
//            System.out.println(str.length());
//        }catch(NullPointerException e){
//            e.printStackTrace();
//        }
//        System.out.println("Main end");
//    }
//}











//        System.out.println("classcastexception example");
//        AAA a = new P();
//        try {
//            Q q = (Q)a;
//        }catch (ClassCastException e){
//            e.printStackTrace();
//        }
//        System.out.println("main end");
//    }
//}
//class AAA{
//
//}
//class P extends AAA{
//
//}
//class Q extends AAA{
//
//}









//        System.out.println("ArrayIndexOutOfBoundException example");
//        int[] a = {1,2,3,4};
//        try {
//            System.out.println(a[4]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        System.out.println("main end");
//    }
//}









//        System.out.println("Arithmetic exception");
//        try {
//            System.out.println(10/0);
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        System.out.println("main end");
//    }
//}










//        System.out.println("Static methods in interface");
//        AAA a = new AAA();
//        a.show();
//        I.display();
//    }
//}
//interface I{
//    void show();
//    static void display(){
//        System.out.println("static method in interface");
//    }
//}
//class AAA implements I{
//    public void show(){
//        System.out.println("implemented abstract method");
//        I.display();
//    }
//}






//        System.out.println("Default methods in interface");
//        AAA a = new AAA();
//        a.show();
//        a.display();
//    }
//}
//interface I{
//    public abstract void show();
//    default void display(){
//        System.out.println("default method in interface");
//    }
//}
//class AAA implements I{
//    public void show(){
//        System.out.println("implemented abstract method show()");
//    }
//    public void display(){
//        System.out.println("overrided default method available in interface");
//    }
//}








//        System.out.println("Marker interface");
//        AAA a = new AAA();
//        if(a instanceof P){
//            a.show();
//        }else {
//            System.out.println("no permission to call show method");
//        }
//    }
//}
//interface P{
//
//}
//class  AAA implements P{
//    public void show(){
//        System.out.println("permission granted for show method");
//    }
//}











//        System.out.println("Functional interface");
//        A1 a = new A1();
//        a.show();
//        a.m2();
//        AAA.m1();
//    }
//}
//@FunctionalInterface
//interface AAA{
//    public abstract void show();
//    static void m1(){
//        System.out.println("static method in interface");
//    }
//    default void m2(){
//        System.out.println("default method in interface");
//    }
//}
//class A1 implements AAA{
//    public void show(){
//        System.out.println("implemented abstract method");
//    }
//    public void m2(){
//        System.out.println("overrided default method");
//    }
//}








//        System.out.println("Abstract class example");
//        S s = new S();
//        s.m1();
//        s.m2();
//        s.m3();
//    }
//}
//abstract class P{
//    public abstract void m1();
//    public abstract void m2();
//    public abstract void m3();
//}
//abstract class Q extends P{
//    public void m1(){
//        System.out.println("m1 implementation");
//    }
//}
//abstract class R extends Q{
//
//}
//class S extends Q{
//    public void m2(){
//        System.out.println("m2 implementation");
//    }
//    public void m3(){
//        System.out.println("m3 implementation");
//    }
//}









//    System.out.println("Abstract class example");
//    EEE e = new EEE();
//    e.m();
//    e.A();
//    e.add();
//    System.out.println(e.i);
//    System.out.println(AAA.j);
//    System.out.println(e.a);
//    System.out.println(AAA.b);
//    e.m1();
//    e.show();
//    AAA.m2();
//    }
//}
//abstract class AAA{
//
//    int i;
//    static  int j;
//    final int a;
//    final static int b;
//    {
//        i =10;
//        a = 80;
//    }
//    static {
//        j = 90;
//        b = 50;
//    }
//    public abstract void m();
//    public abstract void A();
//    public void add(){
//        System.out.println("non static method");
//    }
//    public AAA(){
//        System.out.println("constructor");
//    }
//    public final void m1(){
//        System.out.println("final method");
//    }
//    public static void m2(){
//        System.out.println("static method");
//    }
//    private void m3(){
//        System.out.println("private method");
//    }
//    public void show(){
//        m3();
//    }
//}
//class EEE extends AAA{
//     @Override
//     public void m(){
//         m1();
//     }
//     public void A(){
//         m2();
//     }
//     public void add(){
//         System.out.println("Non static method overriden");
//     }
//}









//    System.out.println("Method hiding");
//    AAA a = new EEE();
//    a.m1();
//
//    }
//}
//class AAA{
//    public static void m1(){
//        System.out.println("parent class");
//    }
//}
//class EEE extends AAA{
//    public static void m1(){
//        System.out.println("child class");
//    }
//}







//        System.out.println("method overriding");
//        EEE e = new EEE();
//        e.m1();
//        e.m2();
//        e.m3();
//        AAA a = new EEE();
//        a.m1();
//        a.m2();
//        a.m3();
//    }
//}
//class AAA{
//    public void m1(){
//        System.out.println("Parent m1");
//    }
//    public void m2(){
//        System.out.println("Parent m2");
//    }
//    public void m3(){
//        System.out.println("Parent m3");
//    }
//}
//class EEE extends AAA{
//    public void m1(){
//        System.out.println("Child m1");
//    }
//    public void m3(){
//        System.out.println("child m3");
//    }
//}








//        System.out.println("Constructor overloading");
//        AAA a = new AAA();
//        AAA a1 = new AAA(10);
//        AAA a2 = new AAA(5f);
//        AAA a3 = new AAA(12,4f);
//        AAA a4 = new AAA(57f, 35);
//    }
//}
//class AAA{
//    public AAA(){
//        System.out.println("no Argument constructor");
//    }
//    public AAA(int a){
//        System.out.println("one argument-int constructor "+a);
//    }
//    public AAA(float b){
//        System.out.println("one argument- float constructor "+b);
//    }
//    public AAA(int a, float b){
//        System.out.println("two argument constructor");
//    }
//    public AAA(float b, int a){
//        System.out.println("different order two argument constructor");
//    }
//
//}








//        System.out.println("Methodoverloading");
//        AAA.add(10);
//        AAA.add(2f);
//        AAA.add(3d);
//        AAA.add(5,6f);
//        AAA.add(5f,6d);
//        AAA.add(7d,'c');
//        AAA.add('c',8d);
//    }
//}
//class AAA{
//    public static void add(int a){
//        System.out.println(a+a);
//    }
//    public static void add(float a){
//        System.out.println(a+a);
//    }
//    public static void add(double a){
//        System.out.println(a+a);
//    }
//    public static void add(int a, float b){
//        System.out.println(b);
//        System.out.println(a+a);
//    }
//    public static void add(float a,double b){
//        System.out.println(b);
//        System.out.println(a+a);
//    }
//    public static void add(double a, char c){
//        System.out.println(c);
//        System.out.println(a+a);
//    }
//    public static void add(char c, double a){
//        System.out.println(c+"at");
//        System.out.println(a+a);
//    }
//}







//        System.out.println("Method overloading");
//        AAA.add();
//        AAA.add(50);
//        AAA.add(50,100);
//    }
//}
//class AAA{
//    public static void add(){
//        System.out.println(10+20);
//    }
//    public static void add(int a){
//        System.out.println(a+a);
//    }
//    public static void add(int a, int b){
//        System.out.println(a+b);
//    }
//}





//        System.out.println("ClassCastException");
//        AAA a = new EEE();
//        FFF f = (FFF) a;
//    }
//}
//class AAA{
//
//}
//class EEE extends AAA{
//
//}
//class FFF extends AAA{
//
//}






//        System.out.println("Upcasting ===========================");
//        AAA a = new EEE();
//        //AAA a = (AAA)new EEE();
//        a.m1();
//        a.m2();
//        System.out.println(a.i);
//        System.out.println("============================== downcasting");
//        EEE e = (EEE)a;
//        e.m1();
//        e.m2();
//        e.m3();
//        System.out.println(e.i);
//        System.out.println(e.j);
//    }
//
//}
//class AAA{
//    int i = 10;
//    public void m1(){
//        System.out.println("Parent class generic");
//    }
//    public void m2(){
//        System.out.println("Overriden parent class");
//    }
//}
//class EEE extends AAA{
//    int j =20;
//    public void m2(){
//        System.out.println("overriden child class");
//    }
//    public void m3(){
//        System.out.println("specific");
//    }
//}





//        System.out.println("Dead lock");
//        thred t = new thred();
//        t.help();
//    }
//}
//class thred extends Thread{
//    AAA a = new AAA();
//    EEE e = new EEE();
//    public void help(){
//        this.start();
//        a.m1(e);
//    }
//    @Override
//    public void run() {
//        e.m2(a);
//    }
//}
//class AAA{
//    public synchronized void m1(EEE e){
//        System.out.println("AAA class calling EEE class tag2 method");
//        e.tag2();
//    }
//    public synchronized void tag1(){
//        System.out.println("tag1 method");
//
//
//    }
//}
//class EEE{
//    public synchronized void m2(AAA a){
//        System.out.println("EEE class calling AAA class tag1 method");
//        a.tag1();
//    }
//    public synchronized void tag2(){
//        System.out.println("tag2 method");
//    }
//}





//        System.out.println("Inter thread communication");
//        User u = new User(2000);
//        new Thread(){
//            @Override
//            public void run() {
//                u.withdraw(5000);
//            }
//        }.start();
//        new Thread(){
//            @Override
//            public void run() {
//                u.deposit(3000);
//            }
//        }.start();
//    }
//}
//class User{
//    int balance;
//    public User(int balance){
//        this.balance = balance;
//    }
//    public synchronized void withdraw(int amount){
//        if (amount>balance){
//            System.out.println("No sufficient amount");
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        balance = balance - amount;
//        System.out.println("withdraw successfulluy");
//        System.out.println("account balance is "+balance);
//    }
//    public synchronized void deposit(int amount){
//        if(amount>0){
//            balance = balance + amount;
//            notify();
//        }
//        System.out.println("credited successfully");
//    }
//}



//        System.out.println("Synchronization static metghod class level");
//        AAA a1 = new AAA("Thread 1");
//        AAA a2 = new AAA("Thread 2");
//        a1.start();
//        a2.start();
//    }
//}
//class AAA extends Thread{
//    String threadName;
//    public AAA(String threadName){
//      this.threadName = threadName;
//    }
//    @Override
//    public void run() {
//        EEE.m1(threadName);
//    }
//}
//class EEE{
//    public static synchronized void m1(String threadNAme){
//        for(int i =1;i<=10;i++){
//            try {
//                Thread.sleep(500);
//                System.out.println(threadNAme+"  "+i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}




//        System.out.println("Synchronization object level disadvantage");
//        EEE e1 = new EEE();
//        EEE e2 = new EEE();
//        AAA a1 = new AAA(e1, "Thread 1");
//        AAA a2 = new AAA(e2,"Thread 2");
//        a1.start();
//        a2.start();
//    }
//}
//class AAA extends Thread{
//    EEE e;
//    String threadName;
//    public AAA(EEE e, String threadName){
//        this.e = e;
//        this.threadName = threadName;
//    }
//    @Override
//    public void run() {
//        e.m1(threadName);
//    }
//}
//class EEE{
//    public synchronized void m1(String threadName){
//        for(int i =0;i<=5;i++){
//            try {
//                Thread.sleep(500);
//                System.out.println(threadName+"  "+i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}


//        System.out.println("Synchronization object level");
//        EEE e = new EEE();
//        AAA a1  = new AAA(e,"Thread 1");
//        AAA a2 = new AAA(e, "Thread 2");
//        a1.start();
//        a2.start();
//    }
//}
//class AAA extends Thread{
//    EEE e;
//    String threadName;
//    public AAA(EEE e, String threadName){
//       this.e = e;
//       this.threadName = threadName;
//    }
//    @Override
//    public void run() {
//        e.m1(threadName);
//    }
//}
//class EEE{
//    public synchronized void m1(String threadName){
//        for(int i =1;i<=10;i++){
//            try {
//                Thread.sleep(250);
//                System.out.println(threadName+"  "+i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}




//        System.out.println("Deamon Thread");
//        AAA a = new AAA();
//        System.out.println(Thread.currentThread().isDaemon());
//        System.out.println(a.isDaemon());
//        a.setDaemon(true);
//        System.out.println(a.isDaemon());
//        a.start();
//        for(int i =1;i<=5;i++){
//            Thread.sleep(250);
//            System.out.println("Parent Thread "+i);
//        }
//    }
//}
//class AAA extends Thread{
//    @Override
//    public void run() {
//        for(int i =1;i<=10;i++){
//            try {
//                Thread.sleep(250);
//                System.out.println("Child Thread "+ i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}







//        System.out.println("Join method in thread");
//        AAA a = new AAA();
//        AAA.t = Thread.currentThread();
//        a.start();
//        for(int i=1;i<=10;i++){
//           // a.join();
//            Thread.sleep(250);
//            System.out.println("Parent Thread "+i);
//        }
//    }
//}
//class AAA extends Thread{
//    static Thread t;
//    @Override
//    public void run() {
//        for(int i =1;i<=10;i++){
//            try {
//                t.join();
//                Thread.sleep(250);
//                System.out.println("Child Thread "+i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}




//        System.out.println("Thread Scheduling");
//        AAA a1 = new AAA("Thread1");
//        AAA a2 = new AAA("Thread 2");
//        AAA a3 = new AAA("Thread 3");
//        a1.setPriority(6);
//        //a1.setPriority(Thread.MIN_PRIORITY);
//        a2.setPriority(8);
//        //a2.setPriority(Thread.MAX_PRIORITY);
//        a3.setPriority(5);
//        //a3.setPriority(Thread.NORM_PRIORITY);
//        a1.start();
//        a2.start();
//        a3.start();
//    }
//}
//class AAA extends Thread{
//    String threadName;
//    public AAA(String threadName){
//        this.threadName = threadName;
//    }
//    @Override
//    public void run() {
//        EEE.m1(threadName);
//    }
//}
//class EEE{
//    public static synchronized void m1(String threadName){
//        for (int i = 1;i<=10;i++){
//            try {
//                Thread.sleep(250);
//                System.out.println(threadName+"  "+i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}





//        System.out.println("Set name and priority of threads/change default name and priority of threads");
//        AAA a = new AAA();
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(a.getName());
//        System.out.println(a.getPriority());
//        System.out.println("==============================================");
//        Thread.currentThread().setName("Parent Thread");
//        Thread.currentThread().setPriority(9);
//        a.setName("Child Thread");
//        a.setPriority(3);
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(a.getName());
//        System.out.println(a.getPriority());
//        a.start();
//    }
//}
//class AAA extends Thread{
//    @Override
//    public void run() {
//        System.out.println("=======================================");
//        System.out.println("Hi");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//    }
//}



//        System.out.println("If exception occurs in one thread, it will stop. The other thread will execute");
//        AAA a = new AAA();
//        a.start();
//        for(int i =0;i<=10;i++){
//            Thread.sleep(250);
//            System.out.println(Thread.currentThread().getName()+" "+i);
//        }
//    }
//}
//class AAA extends Thread{
//    @Override
//    public void run() {
//        for(int i =1;i<=10;i++){
//            try {
//                System.out.println(Thread.currentThread().getName()+"  "+i);
//                Thread.sleep(250);
//                if(i==5){
//                    System.out.println(10/0);
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
//}




//        System.out.println("Creating Thread by implementing runnable interface");
//        AAA a = new AAA();
//        Thread t = new Thread(a);
//        t.start();
//        for(int i =0;i<=10;i++){
//            Thread.sleep(250);
//            System.out.println(Thread.currentThread().getName()+"  "+i);
//        }
//    }
//}
//class AAA implements Runnable{
//    @Override
//    public void run() {
//        for(int i =0;i<=10;i++){
//            try {
//                Thread.sleep(250);
//                System.out.println(Thread.currentThread().getName()+" "+i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}




//        System.out.println("Create thread by extending thread class");
//        AAA a = new AAA();
//        a.start();
//        for(int i =1;i<=10;i++){
//            Thread.sleep(250);
//            System.out.println("Parent Thread "+Thread.currentThread().getName()+"  "+i);
//        }
//    }
//}
//class AAA extends Thread{
//    @Override
//    public void run() {
//        for(int i =1;i<=10;i++){
//            try {
//                Thread.sleep(250);
//                System.out.println("Child Thread "+ Thread.currentThread().getName()+"  "+i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}




//        System.out.println("Inheritance example");
//        EEE e = new EEE();
//        e.show();
//        e.display();
//    }
//}
//class AAA{
//    public void display(){
//        System.out.println("Parent class display method");
//    }
//}
//class EEE extends AAA{
//    public void show(){
//        System.out.println("Child class show method");
//    }
//}


//        System.out.println("Product of digits in a number");
//        System.out.println("Enter tbe number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int product = 1;
//        int r =0;
//        while (n>0){
//            r = n%10;
//            product = product*r;
//            n = n/10;
//        }
//        System.out.println(product);
//    }
//}




//        System.out.println("Sum of digits in a number");
//        System.out.println("Enter tbe number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        int r = 0;
//        while(n>0){
//            r = n%10;
//            sum = sum + r;
//            n = n/10;
//        }
//        System.out.println(sum);
//    }
//}


//        System.out.println("Count of digits");
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        while (n>0){
//            n = n/10;
//            count++;
//        }
//        System.out.println(count);
//    }



//        System.out.println("Fibonacci series");
//        System.out.println("Enter the limit");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        int j = 1;
//        int sum= 0;
//        System.out.print(i+" ");
//        System.out.print(j+" ");
//        for (int a =1;a<=n;a++){
//             sum = i+j;
//             System.out.print(sum+" ");
//             i = j;
//             j = sum;
//        }
//    }


//        System.out.println("combination of upper and lower triangle");
//        System.out.println("enter the limit");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i =1;i<=n;i++){
//            for(int j=n-1;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}



//        System.out.println("Upper triangle");
//        System.out.println("enter the limit");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i =1;i<=n;i++){
//            for (int j = n;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//        System.out.println("Copy cnstructor different class");
//        EEE e = new EEE();
//        AAA a = new AAA(e);
//    }
//}
//class AAA{
//    public AAA(EEE e){
//        e.show();
//    }
//}
//class EEE{
//    public void show(){
//        System.out.println("Copy constructor");
//    }
//}




//        System.out.println("Parameterized constructor");
//        AAA a = new AAA(12, 32);
//    }
//}
//class AAA{
//    int a;
//    int b;
//    public AAA(int a, int b){
//        this.a=a;
//        this.b=b;
//        display();
//    }
//    public void display(){
//        System.out.println(a+"   "+b);
//    }
//}




//        System.out.println("Copy Constructor");
//        AAA a = new AAA(20, 40);
//        AAA a1 = new AAA(a);
//        System.out.println(a.a+"    "+a.b);
//        System.out.println(a1.a+"    "+a1.b);
//    }
//}
//class AAA{
//    int a;
//    int b;
//    public AAA(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    public AAA(AAA obj){
//       this.a = obj.a;
//       this.b = obj.b;
//    }
//}



//        System.out.println("Constructor overloading");
//        AAA a = new AAA();
//        AAA a1 = new AAA(10);
//        AAA a2 = new AAA(20f);
//        AAA a3 = new AAA(10, 20f);
//        AAA a4 = new AAA(20f, 10);
//    }
//}
//class AAA{
//    public AAA(){
//        System.out.println("No argument constructor");
//    }
//    public AAA(int a){
//        System.out.println("One-int argument constructor");
//    }
//    public AAA(float b){
//       System.out.println("one-float argumnet constructor");
//    }
//    public AAA(int a, float f){
//        System.out.println("Two argument(int, float) constructor");
//    }
//    public AAA(float f, int a){
//        System.out.println("Different order argument(float, int) constructor");
//    }
//}




//        System.out.println("Constructor Example");
//        AAA a = new AAA();
//        AAA a1 = new AAA(10);
//    }
//}
//class AAA{
//    int a;
//    public AAA(){
//        System.out.println("no argument constructor");
//    }
//    public AAA(int a){
//        this.a = a;
//        System.out.println("One argument constructor "+a);
//    }


//        System.out.println("This keyword example");
//        AAA a = new AAA();
//        a.add(12, 24);
//    }
//}
//class AAA{
//    int a;
//    int b;
//    public void add(int a, int b){
//        this.a = a;
//        this.b = b;
//        display();
//    }
//    public void display(){
//        System.out.println(a+"   "+b);
//    }
//}


//        System.out.println("This keyword example");
//        AAA a = new AAA();
//        a.show();
//    }
//}
//class AAA{
//    static int a =10;
//    int b =20;
//    public void show(){
//        System.out.println(this.a);
//        System.out.println(this.b);
//    }


//        System.out.println("Lower triangle");
//        System.out.println("Enter the limit");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//        System.out.println("Enter the digit");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int fact = 1;
//        if(num==0){
//            System.out.println("Factorial is "+1);
//        }
//        for(int i =1;i<=num;i++){
//            fact = fact*i;
//        }
//        System.out.println("Factorial is "+fact);
//    }


//        System.out.println("Leap year or not");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if((year%4==0&&year%100!=0)||year%400==0){
//            System.out.println("leap year");
//        }else{
//            System.out.println("not leap year");
//        }


//        System.out.println("Multiplication table");
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=10;i++){
//            System.out.println(i+"*"+n+"="+(i*n));
//        }

//        int a =9, b =67;
//        System.out.println("value of a is "+a+" value of b is "+b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("value of a is "+a+" value of b is "+b);


//        System.out.println("Swapping two numbers using third variable");
//        int a = 4;
//        int b = 8;
//        System.out.println("value of a is "+a+" value of b is "+b);
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("value of a is "+a+" value of b is "+b);

//        System.out.println("Check whether odd or even");
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n%2==0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }

//        System.out.println("Accessing static method, non static method, method with return");
//        ABC abc = new ABC();
//        ABC.add();
//        abc.print();
//        System.out.println(ABC.showOne(2));
//        System.out.println(abc.showTwo(6,4));
//        ABC.move(66);
//        abc.look(80, 50);
//    }
//}
//class ABC{
//    public static void add(){
//        System.out.println("static method ");
//    }
//    public void print(){
//        System.out.println("inside non static method ");
//    }
//    public static int showOne(int a){
//        return a+10;
//    }
//    public int showTwo(int a, int b){
//        return a+b;
//    }
//    public static void move(int k){
//        System.out.println(k);
//    }
//    public void look(int a, int b){
//        System.out.println(a-b);
//    }


//    public static void main(String[] args){
//        System.out.println("Method Overloading");
//        ABC.add();
//        ABC.add(5);
//        ABC.add(8,7);
//    }
//}
//class ABC{
//    public static void add(){
//        System.out.println(10+20);
//    }
//    public static void add(int a){
//        System.out.println(a+40);
//    }
//    public static void add(int a, int b){
//        System.out.println(a+b);
//    }
//}


//        System.out.println("Pattern full star");
//        System.out.println("Enter the limit");
//        int n =0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }


//        System.out.println("Enter the numbers to be added");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int s = a+b;
//        System.out.println("Sum is  "+ s);