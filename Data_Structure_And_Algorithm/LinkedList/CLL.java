package LinkedList;

public class CLL {

    private int size;

    @Override
    public String toString() {
        return "CLL{" +
                "size=" + size +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

    private Node head;
    private Node tail;

    public void info(){
        Node node = head;

        if (node!=null){
            System.out.print("START -> ");
            do{
                System.out.print(node.val + " -> ");
                node=node.next;
            }while (node!=head);
            System.out.print(" END");
        }
    }
    public void  insert(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }
        //this will insert the item last

        tail.next=node;
        node.next=head;
        tail=node;
        size++;

    }

    private class Node{
        private int val;
        private Node next;

        private Node(int val){
            this.val=val;
            this.next=null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        private Node(){

        }

    }
}
