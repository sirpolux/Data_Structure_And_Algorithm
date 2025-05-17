package LinkedList;

public class MainRec {

    public static void main(String[] args) {

        LL linkedList = new LL();
        linkedList.insertFirst(12);
        linkedList.insertFirst(24);
        linkedList.insertFirst(27);
        linkedList.insertFirst(29);
        linkedList.viewData();
        System.out.println();
        linkedList.insertAt(50,2);
        System.out.println();
        linkedList.viewData();
    }
}
