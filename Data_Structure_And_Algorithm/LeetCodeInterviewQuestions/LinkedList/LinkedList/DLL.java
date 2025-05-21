package LeetCodeInterviewQuestions.LinkedList.LinkedList;

public class DLL {

    private int size;
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        if (head==null){
            head=node;
            size++;
            return;
        }

        head.prev=node;
        node.next=head;
        node.prev=null;
        size++;
        head=node;
    }

    public  void insert(int val, int index){

        if (head==null || index==1 || index<1){
            insertFirst(val);
            return;
        }
        if (index==size || index>size){
            insertLast(val);
            return;
        }
        Node nodeBeforeIndex= getNode(index-1);
        Node newNode = new Node(val);
        nodeBeforeIndex.next.prev=newNode;
        newNode.next=nodeBeforeIndex.next;
        newNode.prev=nodeBeforeIndex;
        nodeBeforeIndex.next=newNode;
        size++;
    }

    public void insertLast(int value){
        if (head==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node last = getLastNode();
        node.prev=last;
        last.next=node;
    }

    private Node getNode(int index){
        Node temp;
        if (head==null){
            return null;
        }
        if (index>size){
            return getLastNode();
        }
        temp=head;
        for (int x =1; x<index; x++){
            temp=temp.next;
        }
        return temp;
    }

    private Node getLastNode(){
        Node lastNode = head;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
        }
        System.out.println("Last node "+ lastNode.value);
        return lastNode;
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        private Node(int value){
            this.value= value;
        }
        private Node(int value, Node next, Node prev){
            this.value=value;
            this.prev=prev;
            this.next =next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }


    }

    @Override
    public String toString() {
        return "DLL{" +
                "size=" + size +
                ", head=" + head +
                '}';
    }

    public void printInfo(){
        Node tempHead;
        Node tempTail;
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        tempHead=head;
        System.out.print("START - > ");
        while (tempHead.next!=null){
            System.out.print(tempHead.value + " -> ");
            tempHead=tempHead.next;
        }
        System.out.print(tempHead.value);
        System.out.print("  END");
        System.out.println();
        System.out.println();
        System.out.print("END -> ");
        tempTail=tempHead;
        while (tempTail.prev!=null){
            System.out.print(tempTail.value + " < - ");
            tempTail=tempTail.prev;
        }
        System.out.print(tempTail.value);
        System.out.print(" <- START");
    }



}
