package LinkedList;

public class LL2 {
    @Override
    public String toString() {
        return "LL2{" +
                "size=" + size +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

    private int size;
    private Node head;
    private Node tail;

    private class  Node{
        int value;
        Node next;

        public   Node(int value){
            this.value=value;
        }

        public Node(int value, Node node){
            this.value=value;
            this.next=node;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        if (head==null){
            head=node;
            tail=node;
            size+=1;
            return;
        }
        node.next=head;
        head=node;
        size+=1;
    }


    public  void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void getSize(){
        System.out.println(this.size);
    }

    public void printDetails(){
        System.out.println("Printing list details");
        Node start = head;
        System.out.print("Start -> ");
        while(start!=null){
            System.out.print(start.value + " -> ");
            start=start.next;
        }
        System.out.print("End of Linked List");
    }

    public  void insert(int index, int value){

    }

    private Node getNode(int index){
        return  null;
    }
}
