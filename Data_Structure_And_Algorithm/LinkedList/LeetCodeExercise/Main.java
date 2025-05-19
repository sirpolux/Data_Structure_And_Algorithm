package LinkedList.LeetCodeExercise;

import LinkedList.LL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        LL list2 = new LL();

        List<Integer> items = new ArrayList<>(Arrays.asList(1,3,5,6,7,9));
        List<Integer> items2 = new ArrayList<>(Arrays.asList(2,4,6,8));

        list.addItemsToList(items);
        list2.addItemsToList(items2);

        LL list3  = new LL();
        list3.mergeList(list,list2);
        System.out.println("Printing the list from the main call");
       // list3.printFromHead();

        list3.viewData();
        System.out.println();
        //list3.printFromHead();
//        List<Integer> items = new ArrayList<>(Arrays.asList(3, 5, 5, 7, 7, 10, 12, 15, 15, 18,
//                18, 21, 25, 25, 30, 30, 34, 40, 44, 47));
//        list.addItemsToList(items);
//        list.viewData();
//        System.out.println(list.getSize());
//        list.deleteDuplicate();
//        System.out.println();
//        list.viewData();
    }
}
