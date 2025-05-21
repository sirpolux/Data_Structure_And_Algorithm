package LeetCodeInterviewQuestions.LinkedList;

import LinkedList.LL;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIfLinkedListContainsCycle {
    public static void main(String[] args) {
        isCycle();
    }
    static public boolean findIfListContainsCycle(){
        LL list = new LL();
        ArrayList<Integer> listItems = new ArrayList<>(Arrays.asList(1,2,4,6,7,9,12,14));
        list.addItemsToList(listItems);
        list.convertToCycle(7);
        return list.checkIfListContainCycle();



    }

    static public void isCycle(){
        System.out.println(findIfListContainsCycle());
        System.out.println();
    }
}
