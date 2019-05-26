public class InterSectionOfLLUsingCount {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int a = 1;
        int b = 1;
        int res = 0;
        ListNode acur = headA;
        ListNode bcur = headB;
        while(acur != null){
            a++;
            acur = acur.next;
        }
        while(bcur != null){
            b++;
            bcur = bcur.next;
        }
        res = Math.abs(a-b);
        if(res == 0){
            //a == b == 1
            if(headB == headA){
                return headB;
            }
        }
        if(a>b){
            while(res != 0){
                headA = headA.next;
                res--;
            }
        }else{
            while(res != 0){
                headB = headB.next;
                res--;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
