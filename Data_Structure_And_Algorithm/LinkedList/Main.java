package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(12);
        linkedList.insertFirst(24);
        linkedList.insertFirst(27);
        linkedList.insertFirst(29);
        linkedList.insertFirst(40);
        linkedList.insertFirst(72);
        linkedList.insertLast(30);
        linkedList.insertLast(102);
        linkedList.insertLast(200);
        linkedList.viewData();
        System.out.printf("Size %d%n",linkedList.getSize());
        linkedList.tailInfo();

        linkedList.insert(50,3);
        linkedList.viewData();
        System.out.printf("Size %d%n",linkedList.getSize());

        System.out.println("get at 3");
        System.out.println(linkedList.getValue(3));
        System.out.println("Deleted first");
        System.out.println(linkedList.deleteFirst());
        System.out.printf("Size %d%n",linkedList.getSize());

        linkedList.viewData();
        System.out.println("Deleted last");
        System.out.println("why did i delete 2 here");
        System.out.println(linkedList.deleteLast());
        linkedList.viewData();
        System.out.printf("Size %d%n",linkedList.getSize());
        System.out.println("Deleted last");
        System.out.println("why did i delete 2 here");
        System.out.println(linkedList.deleteLast());
        linkedList.viewData();
        System.out.printf("Size %d%n",linkedList.getSize());
//
//
//        System.out.println("Deleted last");
//        System.out.println(linkedList.deleteLast());
//        linkedList.viewData();
//        System.out.printf("Size %d%n",linkedList.getSize());

        int index =2;
        System.out.printf("Deleted at index: %d",index);
        System.out.println();
        System.out.println(linkedList.deleteNode(index));
        linkedList.viewData();
        System.out.printf("Size %d%n",linkedList.getSize());
        System.out.printf("Deleted at index: %d",index);
        System.out.println();
        System.out.println(linkedList.deleteNode(index));
        linkedList.viewData();
        System.out.printf("Size %d%n",linkedList.getSize());
        System.out.printf("Deleted at index: %d",index);
        System.out.println();
        System.out.println(linkedList.deleteNode(1));
        linkedList.viewData();
        System.out.printf("Size %d%n",linkedList.getSize());
        System.out.println(linkedList.getSize());

    }
}
