class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        // Dummy node helps handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // prevGroupEnd points to the node before the current group
        ListNode prevGroupEnd = dummy;

        while (true) {

            // Find the kth node from prevGroupEnd
            ListNode kthNode = prevGroupEnd;

            for (int i = 0; i < k && kthNode != null; i++) {
                kthNode = kthNode.next;
            }

            // Less than k nodes left
            if (kthNode == null) {
                break;
            }

            // Start and end information of current group
            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kthNode.next;

            // Reverse current group
            ListNode prev = nextGroupStart;
            ListNode curr = groupStart;

            while (curr != nextGroupStart) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect previous group to reversed group
            prevGroupEnd.next = kthNode;

            // groupStart becomes the tail after reversal
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }
}