public class ListNodeUtils {
    
    public static void traversal(ListNode head){
        if(head == null){
            System.out.println("No element in list");
            return;
        }
        
         ListNode current = head;
        while(current != null){
            if(current.next != null)System.out.print(current.val + "->");
            else System.out.print(current.val + "\n");
            current = current.next;
        }
    }

    public static ListNode fillNodes(){
        ListNode head = null;
        ListNode tail = null;

        for(int i =1;i<=10;i++){
            ListNode newNode = new ListNode(i);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
        return head;
    }

    public static int getSize(ListNode head){
        int count = 0;
        while(head != null){
            count ++;
            head = head.next;
        }
        return count;
    }
}
