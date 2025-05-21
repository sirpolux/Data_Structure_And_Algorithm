package LeetCodeInterviewQuestions.LinkedList.LinkedList;

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

    public void delete(int val){
        Node node = head;
        if (node==null){
            return;
        }
        if (node.val==val){
            head=null;
            tail=null;
            size--;
        }
        while (node.next!=head){
            if(node.next.val==val){
                if (node.next==tail){
                    tail=node.next.next;
                }
                node.next=node.next.next;
                size--;
                return;
            }
            node=node.next;
          //  if (node.ne)
        }

    }

    public void printHeadAndTail(){
        System.out.println("************************");
        System.out.printf("Head: %s\nTail: %s\n",head.val, tail.val);
        System.out.println("************************");

    }

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
