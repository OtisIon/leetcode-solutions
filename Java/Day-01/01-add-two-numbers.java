// Name: Rohit Mishra

/*
Add two numbers represented as reversed linked lists.

Example:
l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
*/

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // dummy head
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // start with carry

            if (l1 != null) {
                sum += l1.val; // add l1 value
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val; // add l2 value
                l2 = l2.next;
            }

            carry = sum / 10; // update carry
            current.next = new ListNode(sum % 10); // store digit
            current = current.next;
        }

        return dummy.next; // skip dummy
    }
}
