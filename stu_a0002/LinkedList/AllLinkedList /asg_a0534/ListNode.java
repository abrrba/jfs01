import java.util.*;
class ListNode {

    private int data;
    private ListNode next;

    ListNode(int val) {
        data = val;
        next = null;
    }

    public void setData(int val) {
        data = val;
    }

    public int getData() {
        return data;
    }

    public void setNext(ListNode n) {
        next = n;
    }

    public ListNode getNext() {
        return next;
    }
}
