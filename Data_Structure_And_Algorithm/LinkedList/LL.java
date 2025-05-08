package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;


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
    }
}
