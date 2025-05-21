package LeetCodeInterviewQuestions.LinkedList.LinkedList;

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
        if (index==1){
            insertFirst(value);
            return;
        }
        if (index == size || index>size){
            insertLast(value);
            return;
        }
        Node before = getNode(index-1);
        Node after = before.next;
        before.next=new Node(value,after);
        size+=1;

    }

    public int deleteFirst(){
        if (head!=null){
            int deleted=head.value;
            head=head.next;
            size--;
            return deleted;
        }else{
            throw new RuntimeException("Cannot delete item. Linked list is empty");
        }
    }

    public int deleteLast(){
        if (head==null){
            throw  new RuntimeException("Cannot delete item from an empty list");
        }

        Node beforeLast = getNode(size-1);
        int deleted = beforeLast.next.value;
        beforeLast.next=null;
        tail=beforeLast;
        size--;
        return  deleted;

    }

    public int deleteAt(int index){
        if (index>size || index<0){
            throw new RuntimeException("Invalid index. Index not in range");
        }
        if (index==1){
            deleteFirst();
        }
        if(index==size){
            deleteLast();
        }
        Node itemBeforeDelete = getNode(index-1);
        int deletedItem = itemBeforeDelete.next.value;
        itemBeforeDelete.next=itemBeforeDelete.next.next;
        size--;
        return deletedItem;
    }

    private Node getNode(int index){
        Node temp=head;
        if (index==1){
            return head;
        }
        if (index>size){
            return null;
        }
        for (int i=1; i<index;i++){
            temp=temp.next;
        }
        return  temp;
    }
}
