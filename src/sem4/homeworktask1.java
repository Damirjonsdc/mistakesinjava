
package sem4;
public class homeworktask1 {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public class ReverseLinkedList {
        public ListNode reverseList(ListNode head) {
            ListNode reversedList = null;

            while (head != null) {
                ListNode newNode = new ListNode(head.val);
                newNode.next = reversedList;
                reversedList = newNode;
                head = head.next;
            }

            return reversedList;
        }
    }
}