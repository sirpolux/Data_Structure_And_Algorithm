package LinkedList.LeetCodeExercise;

import LinkedList.LL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        List<Integer> items = new ArrayList<>(Arrays.asList(3, 5, 5, 7, 7, 10, 12, 15, 15, 18,
                18, 21, 25, 25, 30, 30, 34, 40, 44, 47));
        list.addItemsToList(items);
        list.viewData();
        System.out.println(list.getSize());
        list.deleteDuplicate();
        System.out.println();
        list.viewData();
    }
}
