/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class InterSectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         HashMap<ListNode,Integer> map = new HashMap<ListNode,Integer>();
        ListNode current1 = headA;
        ListNode current2 = headB;
        while(current1!=null){
                map.put(current1,current1.val);
                current1 = current1.next;
        }
        
        while(current2!=null){
            if(map.containsKey(current2)){
                return current2;
               
            }else{
                map.put(current2,current2.val);
            }
            current2 = current2.next;
        }
        
        return null;
    }   
}
