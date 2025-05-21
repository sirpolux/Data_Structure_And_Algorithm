package LeetCodeInterviewQuestions.LinkedList.LinkedList;

import java.util.ArrayList;
import java.util.List;

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


    public void addItemsToList(List<Integer> vals){
       vals.forEach(this::insertLast);
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
    public void  deleteDuplicate(){
        head=deleteDuplicate(head);
    }


    public  void printFromHead(){
        System.out.println(head);
    }
//    private Node deleteDuplicate(Node node){
//        if (node.next==null){
//            return node;
//        }
//        if (node.next.value== node.value){
//            node.next = node.next.next;
//            return deleteDuplicate(node);
//        }
//        node.next=deleteDuplicate(node.next);
//        return node;
//    }

    private Node deleteDuplicate(Node node){
        if (node.next==null){
            tail=node;
            return node;
        }
        if(node.value == node.next.value){
            node.next=node.next.next;
            size--;
            return deleteDuplicate(node);
        }

        node.next=deleteDuplicate(node.next);
        return  node;

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

    public void viewDataCircle(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

     public LL mergeList(LL l1, LL l2){
        LL list = new LL();
        Node head = mergeList2(l1.head,l2.head);
         //System.out.println(head);
        this.head=head;
         System.out.println("Printing the head of the list");
         //System.out.println(list.head);
        return  list;
    }

    private Node mergeList(Node list1, Node list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        Node head1 = null;
        Node newNode = new Node() ;
        Node f = list1;
        Node l = list2;

        while(f!=null && l!=null){

            Node entry;
            if(f.value<l.value){
                entry = new  Node(f.value);
                f=f.next;
            }else{
                entry = new Node(l.value);
                l=l.next;
            }
            if(head1==null){
                head1 = entry;
                newNode=head1;
            }else{
                newNode.next=entry;
                newNode=newNode.next;
            }

        }
        while(f!=null){
            Node entry = new Node(f.value);
            newNode.next=entry;
            newNode=newNode.next;
            f=f.next;
        }
        while(l!=null){
            Node entry = new Node(l.value);
            newNode.next=entry;
            newNode=newNode.next;
            l=l.next;
        }

        return head1;
    }

    private Node mergeList2(Node n1, Node n2){
        if (n1==null){
            return n2;
        }
        if (n2==null){
            return  n1;
        }
        Node newHead = new Node();
        Node tail = newHead;

        while (n1!=null && n2!=null){
           // System.out.printf("List 1: %s\nList 2: %s", n1.value, n2.value);
            if(n1.value<n2.value){
                tail.next=n1;
                n1=n1.next;
                tail=tail.next;

            }else {
                tail.next=n2;
                n2=n2.next;
                tail=tail.next;

            }
            //print(newHead);
            //print(tail);
        }

        tail.next=n1!=null?n1:n2;
        //print(newHead.next);
        return newHead.next;
    }

    private void print(Node node){
        System.out.println(node);
    }

    private Node getNode(int index){
        if (index>=size){
            return null;
        }
        Node temp =head;
        for(int x = 0; x<index;x++){
            temp=temp.next;
        }
        return temp;
    }

    public  int getValue(int index){
        Node temp = getNode(index);
        assert temp != null;
        return temp.value;
    }

    public void insert(int val, int position){
        if(position==1){
            insertFirst(val);
            return;
        }
        if(position==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int x=1; x<position; x++){
            temp=temp.next;
        }

        Node entry = new Node(val,temp.next);
        temp.next=entry;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head=head.next;
        size-=1;
        return value;
    }

    public int deleteLast(){
        if (size==1){
            return  deleteFirst();
        }
        Node secondLast = getNode(size-2);
        int val= tail.value;
        tail=secondLast;
        tail.next=null;
        size-=1;
        return val;
    }

    public int deleteNode(int index){
        if(index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev = getNode(index-1);
        int value = prev.next.value;
        prev.next=prev.next.next;
        size-=1;
        return value;
    }

    public void insertAt(int val, int index)
    {
       head=insertAtRec(val,index,head);
    }

    private Node insertAtRec(int val, int index, Node node){

        if(index==0){
            Node newEntry = new Node(val);
            newEntry.next=node;
            size++;
            return newEntry;
        }
        if (node.next==null){
            Node newEntry = new Node(val);
            node.next=newEntry;
            return node;
            //throw new RuntimeException("Index exceeds size of linked list");
        }
        System.out.println(node.value);
        node.next=insertAtRec(val,index-1,node.next);
        return node;
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

        public Node(){

        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }


    }

    public  boolean checkIfListContainCycle(){
        Node head = this.head;
        Node fastPointer = head;
        Node slowPointer = head;
        boolean notFirstRun = false;
        while (fastPointer!=null && fastPointer.next!=null){
            if (notFirstRun){
                if (slowPointer==fastPointer){
                    return true;
                }
            }else {
                notFirstRun=true;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return false;
    }

    public void createListWithCycle(ArrayList<Integer> items, int circlePointer){
        addItemsToList(items);
        if (circlePointer<this.size){
            Node last = this.tail;
            Node cyclePoints = getNode(circlePointer);
            last.next=cyclePoints;
            System.out.println("Circle points to : "+circlePointer);
        }

    }

    public void convertToCycle(int position){
        if(position<this.size){
            Node cyclePointer = getNode(position);
            Node last = this.tail;
            last.next = cyclePointer;
        }
    }


    public Res getCirclePosition(){

        Node head = this.head;
        Node fastPointer = head;
        Node slowPointer = head;
        int len = 0;
        boolean notFirstRun = false;
        while (fastPointer!=null && fastPointer.next!=null){
            if (notFirstRun){
                if (slowPointer==fastPointer){
                    Node pointer2 = slowPointer.next;
                    len ++;
                    while (pointer2!=slowPointer){
                        pointer2=pointer2.next;
                        len++;
                    }
                }
            }else {
                notFirstRun=true;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        Node circleStartNode = getStartNode(len);
        return new Res(len,circleStartNode);
    }

    private Node getStartNode(int len){
        Node startPoint = this.head;
        Node pointer1 = startPoint;
        Node pointer2 = startPoint;
        while (len>0){
            pointer1=pointer1.next;
            len--;
        }
        while (pointer2!=pointer1){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }

        return pointer1;
    }

    private class Res{
        private Node node;
        private int position;

        public Res(int position, Node node){
            this.node= node;
            this.position = position;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }

}
