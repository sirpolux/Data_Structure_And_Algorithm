package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(12);
        linkedList.insertFirst(24);
        linkedList.insertFirst(27);
        linkedList.insertLast(30);
        linkedList.insertLast(102);
        linkedList.viewData();
        System.out.println(linkedList.getSize());
        linkedList.tailInfo();


    }
}
