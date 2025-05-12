package LinkedList;

public class Main2 {

    public static void main(String[] args) {
        LL2 linkedList = new LL2();
        linkedList.getSize();
        linkedList.insertFirst(24);
        linkedList.insertFirst(12);
        linkedList.insertFirst(32);
        linkedList.insertLast(9);
        linkedList.insertLast(30);

        linkedList.printDetails();
        System.out.println();
        System.out.println(linkedList.toString());

    }
}
