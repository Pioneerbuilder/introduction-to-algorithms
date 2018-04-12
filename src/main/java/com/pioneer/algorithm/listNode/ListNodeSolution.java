package com.pioneer.algorithm.listNode;

/**
 * Created by daydayup on 2018/4/12.
 */
public class ListNodeSolution {

    static class ListNode {
        ListNode next;
        int val;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode lastNode = null;
        ListNode thisNode = null;
        do {

            thisNode = new ListNode(node.val);
            thisNode.next = lastNode;
            lastNode = thisNode;
        } while((node = node.next) != null);
        return thisNode;
    }

    public static void main(String[] args) {
        ListNodeSolution solution = new ListNodeSolution();
        ListNode head = new ListNode(3);
        ListNode node0 = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(6);
        head.next = node0;
        node0.next = node1;
        node1.next = node2;

        ListNode node = head;
        System.out.println("the input is:");
        do {
            System.out.println(node.val);
        } while ((node = node.next) != null);
        ListNode result = solution.reverseList(head);

        node = result;
        System.out.println("the result is:");
        do {
            System.out.println(node.val);
        } while ((node = node.next) != null);
    }
}
