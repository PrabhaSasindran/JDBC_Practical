package DoublyLinkedListPack;

public class DoublyLinkedListExample {
    private Node first = null;
    private int count=0;
    public void add(Object ele){
        if(first==null){
            first = new Node(ele);
            count++;
            return;
        }
        Node curr = first;
        while (curr.next != null){
            curr = curr.next;
        }
        Node n = new Node(ele,null,curr);
        curr.next = n;
        count++;
    }
    public void add(Object ele, int index){
       if(index<=-1||index>=size()){
           throw  new IndexOutOfBoundsException();
       }
       if(index==0){
           Node n = new Node(ele,first,null);
           first.prev = n;
           first = n;
           count++;
           return;
       }
       Node curr = first;
       for(int i=1;i<index;i++){
           curr =curr.next;
       }
       Node n = new Node(ele,curr.next,curr);
       curr.next.prev = n;
       curr.next = n;
       count++;
    }
    public void remove(int index){
        if(index<=-1||index>=size()){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            Node n = first.next;
            first.next = null;
            first = n;
            //first = first.next;
            first.prev = null;
            count--;
            return;
        }
        Node curr = first;
        for(int  i =1;i<index;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        curr.next.prev = curr;
        count--;
    }
    public int size(){
        return count;
    }
    public Object get(int index){
        if(index<=-1 ||index>= size()){
            throw new IndexOutOfBoundsException();
        }
        Node curr = first;
        for(int i = 1;i<=index;i++){
            curr = curr.next;
        }
        return curr.ele;
    }
    public boolean isEmpty(){
        if(first == null){
           return true;
        }else {
            return false;
        }
    }
    public void removeAll(){
        first = null;
        count =0;
    }
}