package LinkedList;

public class Main3 {
    public static void main(String[] args) {
        DLL list =  new DLL();
        list.insertFirst(56);
        list.insertFirst(30);
        list.insertFirst(43);
        list.insertFirst(49);
        list.insertFirst(52);
        list.printInfo();

        System.out.println();
        System.out.println();
        System.out.println("Inserting Last");

        list.insertLast(10);
        System.out.println();
        list.printInfo();
        System.out.println();
        System.out.println();
        System.out.println("Inserting at index .....");
        list.insert(99, 3);
        list.printInfo();
        list.insert(22, 5);
        System.out.println();
        System.out.println();
        list.printInfo();

        //System.out.println(list);

    }
}
