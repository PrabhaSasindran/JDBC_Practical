public class InstanceOFExample {
    public static void main(String[] args){
        IOC c = new IOC();
        System.out.println(c instanceof IOB);
        System.out.println(c instanceof IOC);
        System.out.println(c instanceof Object);
        IOD d = new IOD();
        System.out.println(d instanceof IOB);
        System.out.println(d instanceof IOD);
        System.out.println(d instanceof Object);
    }
}
class IOB{

}
class IOC extends IOB{

}
class IOD extends IOB{

}