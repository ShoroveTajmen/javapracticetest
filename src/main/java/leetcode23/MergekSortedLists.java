package leetcode23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergekSortedLists {

    private ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> datalist = new ArrayList<>();
        int length = lists.length;
        for (int i = 0; i < lists.length; i++) {
            ListNode x = lists[i];
            while (x != null) {
                datalist.add(x.val);
                x = x.next;
            }
        }
        if (datalist.isEmpty()) return null;
        Collections.sort(datalist);

        ListNode head = new ListNode();
        ListNode temp = head;

        int size = datalist.size();
        for (int i = 0; i < size; i++) {
            Integer x = datalist.get(i);
            temp.val = x;
            if (i < size - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return head;

    }

    public void display(ListNode[] lists) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MergekSortedLists m1 = new MergekSortedLists();


        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(5);

        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(3);
        n2.next.next = new ListNode(4);

        ListNode n3 = new ListNode(2);
        n1.next = new ListNode(6);



        ListNode[] list = {n1, n2, n3};
        m1.mergeKLists(list);
        m1.display(list);



    }
}
