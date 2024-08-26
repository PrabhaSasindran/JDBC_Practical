package SinglyLinkedListPack;

public class SinglyLinkedListMain {
    public static void main(String[] args){
        SinglyLinkedListExample l = new SinglyLinkedListExample();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        l.add(40,0);
        l.add(50,2);
        l.add(60,3);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        //--l.removeAll();
        //System.out.println(l.size());
        //System.out.println(l.isEmpty());
        l.remove(0);
        l.remove(2);
        System.out.println(l.size());
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.get(3));
    }
}
