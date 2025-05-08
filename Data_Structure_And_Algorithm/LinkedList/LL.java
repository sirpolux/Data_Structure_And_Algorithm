package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node temp = new Node(value);
        temp.next=head;
        head=temp;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void tailInfo(){
        System.out.println(tail);
    }
    public void insertLast(int val){
        if (size==0){
            insertFirst(val);
            return;
        }
        Node temp = new Node(val);
        tail.next=temp;
        tail=temp;
        size+=1;

    }
    public int getSize(){
        return size;
    }

    public void viewData(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        int value;
        Node next;

        public  Node(int value){
            this.value=value;
        }

        public  Node (int value, Node node){
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
}
