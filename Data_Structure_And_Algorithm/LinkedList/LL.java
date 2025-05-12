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
