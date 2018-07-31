package com.kong;

public class Sum_2 {

    private ListNode addNumToList(ListNode l, int num){
        ListNode head = l;
        while (num > 0){
            int tmp = head.val + num;
            if (tmp >= 10){
                head.val = tmp - 10;
                num = 1;
            }else{
                head.val = tmp;Ø
                num = 0;
            }
            if (head.next == null && num > 0){
                head.next = new ListNode(1);
                num = 0;
            }else {
                head = head.next;
            }
        }

        return  l;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cursor = l1;
        ListNode tmp = null;
        while (cursor != null){
            if (l2 != null) {
                cursor = addNumToList(cursor, l2.val);
            }else{
                break;
            }

            l2 = l2.next;
            if (cursor.next == null){
                tmp = cursor;
            }
            cursor = cursor.next;
        }

        if (cursor == null && l2 != null){
            tmp.next = l2;
        }

        return  l1;
    }

    public static void main(String[] args) {
//        System.out.println("result" + Integer.toBinaryString(4 << 2));
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        Sum_2 sum2 = new Sum_2();
        ListNode result = sum2.addTwoNumbers(l11, l21);
//        ListNode result = sum2.addNumToList(l21, 1);
        while (result != null) {
            System.out.println(result.val + "->");
            result = result.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
