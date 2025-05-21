package LeetCodeInterviewQuestions.LinkedList.LinkedList;


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// mPoint represents meeting point. In this use case it is the first point where the slow and fast pointer meets when using Floyd's Tortoise and Hare alogoritm.

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode mPoint= getMeetingPoint(head);
        ListNode startPoint = null;
        if(mPoint == null){
            return null;
        }
        length = getCycleLength(mPoint);
        startPoint = getStartingNode(head,length);
        return startPoint;


    }

    private ListNode getMeetingPoint(ListNode node){
        if(node == null ){
            return null;
        }
        ListNode fastPointer = node;
        ListNode slowPointer = node;
        boolean notFirstRun = false;

        while(fastPointer!=null && fastPointer.next!=null){
            if(notFirstRun){
                if(fastPointer==slowPointer){
                    return fastPointer;
                }
            }else{
                notFirstRun=true;
            }
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return null;
    }

    private int getCycleLength(ListNode mPoint){
        int len = 0;
        ListNode pointer = mPoint.next;
        len++;
        while(pointer!=mPoint){
            pointer=pointer.next;
            len++;
        }
        return len;
    }
    private ListNode getStartingNode(ListNode node, int cycleLen){
        ListNode point1 = node;
        ListNode point2 = node;

        for(int x = cycleLen; x>0; x--){
            point1 = point1.next;
        }
        while (point1!=point2){
            point2=point2.next;
            point1=point1.next;
        }
        return point2;
    }
}