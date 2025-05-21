package LinkedList;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
    public ListNode(int val){
        this.value = val;
    }

    public ListNode() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
