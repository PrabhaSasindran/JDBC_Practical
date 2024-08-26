package DoublyLinkedListPack;

public class DoublyLinkedListMain {
    public static void main(String[] args){
        DoublyLinkedListExample l = new DoublyLinkedListExample();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40,0);
        l.add(40,3);
        System.out.println(l.size());
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        System.out.println(l.get(4));
        l.remove(0);
        l.remove(2);
        System.out.println(l.size());
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.isEmpty());
        //l.removeAll();
        //System.out.println(l.size());
    }
}
