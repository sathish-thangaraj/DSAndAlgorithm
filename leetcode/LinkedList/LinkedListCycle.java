public class LinkedListCycle {

    static ListNode head ;

    static class ListNode{
        int data ;
        ListNode next ;

        ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public static void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode ;
    }

    static int detectLoop(){

        ListNode slowPointer = head ;
        ListNode fastPointer = head ;

        while(slowPointer!=null && fastPointer !=null && fastPointer.next !=null ){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer){
                return 1 ;
            }

        }
        return 0 ;
    }

    public static void main(String[] args){
        LinkedListCycle list = new LinkedListCycle();
        list.push(5);
        list.push(10);
        list.push(15);
        list.push(20);

        list.head.next.next.next = list.head ;

        System.out.println(list.detectLoop());
    }
}
