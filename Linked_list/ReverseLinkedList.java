

// Approach : 
//     Before breaking link store it in variable like ListNode next = current.next
//     Assign next to previous  like current.next = prev
//     Assign prev to current like prev= current
//     Assign current to next like current= next

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val =val;
    }
}

public class ReverseLinkedList {

    public void traversal(ListNode head){
        ListNode current = head;
        while(current != null){
            if(current.next != null)System.out.print(current.val + "->");
            else System.out.print(current.val + "\n");
            current = current.next;
        }

        }

        public static ListNode reverse(ListNode head){
            ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return  prev;
        }
    

   public static void main(String[] args) {

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
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


        // traversal before reverse 
        System.out.println("Before reverse");
        reverseLinkedList.traversal(head);


        // Reversal 
        ListNode reversedList = ReverseLinkedList.reverse(head);

        // Iteration after traversal

         System.out.println("After reverse");
        reverseLinkedList.traversal(reversedList);

        
   }
    
}
