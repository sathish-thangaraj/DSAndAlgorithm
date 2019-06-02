//https://leetcode.com/explore/interview/card/top-interview-questions-medium/107/linked-list/783
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0 ; 
         ListNode dummy = new ListNode(0);
         ListNode curr = dummy;
        while(l1!=null || l2!=null || count != 0) {
           int sum = 0;
            if (l1 != null) {
                sum += l1.val; 
                l1 = l1.next;
            } 
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum = sum + count;
        int reminder = sum % 10;
        count = sum / 10;
        
        ListNode tmp = new ListNode(reminder);
        curr.next = tmp;
        curr = curr.next;
        }
         return  dummy.next;
    }
}
