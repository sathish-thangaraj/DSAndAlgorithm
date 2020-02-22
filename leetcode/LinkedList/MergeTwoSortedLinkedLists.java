import java.util.PriorityQueue;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
class MergeTwoSortedLinkedLists {

    public static void main(String[] args){

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode output = mergeSortedListUsingIteration(l1,l2);

        while(output!=null){
            System.out.println(output.val);
            output = output.next;
        }

    }
    public static ListNode mergeTwoListsUsingPriorityQueue(ListNode l1, ListNode l2) {

        PriorityQueue<ListNode> naturalOrderQueue = new PriorityQueue<>((a, b)->a.val-b.val);

        while(l1!=null){
            naturalOrderQueue.offer(l1);
            l1 = l1.next;
        }

        while(l2!=null){
            naturalOrderQueue.offer(l2);
            l2=l2.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode output = dummy;

        while(!naturalOrderQueue.isEmpty()){
            ListNode newNode = new ListNode(naturalOrderQueue.poll().val);
            dummy.next = newNode;
            dummy = dummy.next;
        }

        return output.next;
    }

    public static ListNode mergeSortedListUsingIteration(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode output = dummy ;

        while(l1!=null && l2!=null){

            if(l1.val<l2.val){
                dummy.next = l1;
                l1 = l1.next;
            }
            else{
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        dummy.next = l1==null ? l2:l1;
        return output.next;
    }
}
