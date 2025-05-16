package LinkedList;

public class Main4 {
    public static void main(String[] args) {
        CLL list  = new CLL();
        list.insert(23);
        list.insert(20);
//        list.insert(33);
//        list.insert(40);
//        list.insert(45);


        list.info();
        list.printHeadAndTail();
        //list.delete(33);
        list.delete(20);
        System.out.println();
        list.info();
       System.out.println();
        list.printHeadAndTail();
//        list.delete(45);
//        list.delete(50);
       // list.info();
    }
}
