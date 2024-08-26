package DoublyLinkedListPack;

public class Node {
    Object ele;
    Node next;
    Node prev;
    public Node(Object ele){
        this.ele = ele;
    }
    public Node(Object ele, Node next, Node prev){
        this.ele = ele;
        this.next = next;
        this.prev = prev;
    }
}
